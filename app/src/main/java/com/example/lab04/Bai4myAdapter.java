package com.example.lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Bai4myAdapter extends RecyclerView.Adapter<Bai4myAdapter.MyHolder> {
    private Context context;
    private List<PersonBai4> arrayList;

    public Bai4myAdapter(Bai4Activity mainActivity, ArrayList<PersonBai4> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bai4myrecyclerview_row, parent, false);

        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final PersonBai4 item = arrayList.get(position);
        holder.textview.setText(item.getName());
        holder.imageview.setImageResource(item.getIcon());

        holder.imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(item.getIcon() == R.drawable.ic_personcolor){
                    item.setIcon(R.drawable.ic_personblack);
                    notifyDataSetChanged();
                }
                else {
                    item.setIcon(R.drawable.ic_personcolor);
                    notifyDataSetChanged();
                }
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
        ImageView imageview;

        public MyHolder(@NonNull View item) {
            super(item);
            textview = item.findViewById(R.id.textview);
            recyclerview = item.findViewById(R.id.recyclerview);
            imageview = item.findViewById(R.id.imageview);

        }
    }


}
