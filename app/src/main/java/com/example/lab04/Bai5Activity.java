package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai5Activity extends AppCompatActivity {
    private RecyclerView recyclerview5;
    private ArrayList arrayList;
    Bai5myAdapter arrayAdapter;
    Button BtnAdd;
    Button BtnRemove;
    TextView textviewcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        recyclerview5 = findViewById(R.id.recyclerview5);
        BtnAdd = findViewById(R.id.BtnAdd);
        BtnRemove = findViewById(R.id.BtnRemove);
        textviewcount = findViewById(R.id.textviewcount);

        arrayList = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview5.setLayoutManager(linearLayoutManager);

        arrayAdapter = new Bai5myAdapter(this, arrayList);
        recyclerview5.setAdapter(arrayAdapter);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = arrayList.size();
                for(int i= count + 1; i < count + 6; i++){

                    String a = "user" + i;
                    String b = "user" +(i) + "@tdtu.edu.vn";
                    arrayList.add(new UserBai5(a,b));
                    arrayAdapter.notifyDataSetChanged();
                    textviewcount.setText("Total users: " + arrayList.size());
                }
            }
        });

        BtnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = arrayList.size();
                for(int i= count; i > count - 5; i--){
                    arrayList.remove(i - 1);
                    arrayAdapter.notifyDataSetChanged();
                    textviewcount.setText("Total users: " + arrayList.size());

                }
                if(arrayList.size() == 0){
                Toast.makeText(Bai5Activity.this, "List of users is empty", Toast.LENGTH_SHORT).show();}
            }

        });

    }
}