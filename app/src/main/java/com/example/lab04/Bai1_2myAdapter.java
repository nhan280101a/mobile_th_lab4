package com.example.lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Bai1_2myAdapter extends RecyclerView.Adapter<Bai1_2myAdapter.MyHolder> {
    private Context context;
    private List<String> arrayList;

    public Bai1_2myAdapter(MainActivity mainActivity, List<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bai1_2myrecyclerview_row, parent, false);

        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final String item = arrayList.get(position);
        holder.textview.setText(item);

        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "" + holder.textview.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.BtnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.remove(item);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView textview;
        RecyclerView recyclerview;
        Button BtnRemove;

        public MyHolder(@NonNull View item) {
            super(item);
            textview = item.findViewById(R.id.textview);
            recyclerview = item.findViewById(R.id.recyclerview);
            BtnRemove = item.findViewById(R.id.BtnRemove);

        }
    }


}
