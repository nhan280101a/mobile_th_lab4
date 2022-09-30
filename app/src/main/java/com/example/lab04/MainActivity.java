package com.example.lab04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private ArrayList arrayList;
    private Bai1_2myAdapter arrayAdapter;
    Button BtnRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        BtnRemove = findViewById(R.id.BtnRemove);

        arrayList = new ArrayList<>();
        for (int i  = 1; i <= 20; i++){
            arrayList.add("item" + i);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(linearLayoutManager);

        arrayAdapter = new Bai1_2myAdapter(this, arrayList);
        recyclerview.setAdapter(arrayAdapter);

    }
}