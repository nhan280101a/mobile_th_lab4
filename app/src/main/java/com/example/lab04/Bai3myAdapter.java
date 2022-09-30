package com.example.lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Bai3myAdapter extends RecyclerView.Adapter<Bai3myAdapter.MyHolder> {
    private Context context;
    private List<Bai3Country> arrayList;

    public Bai3myAdapter(Bai3Activity mainActivity, ArrayList<Bai3Country> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bai3myrecyclerview_row, parent, false);

        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final Bai3Country item = arrayList.get(position);
        holder.textview.setText(item.getName());
        holder.checkbox.setChecked(item.getChecked());
        holder.imageviewAvatar.setImageResource(item.getIcon());

        holder.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    item.setChecked(true);
                }
                else {
                    item.setChecked(false);
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
        Button BtnRemoveAll;
        CheckBox checkbox;
        ImageView imageviewAvatar;

        public MyHolder(@NonNull View item) {
            super(item);
            textview = item.findViewById(R.id.textview);
            recyclerview = item.findViewById(R.id.recyclerview);
            BtnRemoveAll = item.findViewById(R.id.BtnRemoveAll);
            checkbox = item.findViewById(R.id.checkbox);
            imageviewAvatar = item.findViewById(R.id.imageviewAvatar);

        }
    }


}