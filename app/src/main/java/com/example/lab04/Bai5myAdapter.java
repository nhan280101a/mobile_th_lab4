package com.example.lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Bai5myAdapter extends RecyclerView.Adapter<Bai5myAdapter.MyHolder> {
    private Context context;
    private List<UserBai5> arrayList;

    public Bai5myAdapter(Bai5Activity mainActivity, ArrayList<UserBai5> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bai5myrecyclerview_row, parent, false);

        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final UserBai5 item = arrayList.get(position);
        holder.textview1.setText(item.getName());




    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView textview1;
        TextView textview2;
        RecyclerView recyclerview;
        Button BtnAdd;
        Button BtnRemove;


        public MyHolder(@NonNull View item) {
            super(item);
            textview1 = item.findViewById(R.id.textview1);
            textview2 = item.findViewById(R.id.textview2);
            recyclerview = item.findViewById(R.id.recyclerview);
            BtnAdd = item.findViewById(R.id.BtnAdd);
            BtnRemove = item.findViewById(R.id.BtnRemove);

        }
    }


}
