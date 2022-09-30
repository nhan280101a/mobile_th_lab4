package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {

    private RecyclerView recyclerview3;
    private ArrayList arrayList;
    Bai3myAdapter arrayAdapter;
    Button BtnRemoveAll;
    Button BtnRemoveSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        BtnRemoveAll = findViewById(R.id.BtnRemoveAll);
        BtnRemoveSelected = findViewById(R.id.BtnRemoveSelected);

        recyclerview3 = findViewById(R.id.recyclerview3);

        ArrayList<Bai3Country> arrayList = new ArrayList<>();
        arrayList.add(new Bai3Country(R.drawable.ic_uk,"United Kingdom"));
        arrayList.add(new Bai3Country(R.drawable.ic_austria,"Austria"));
        arrayList.add(new Bai3Country(R.drawable.ic_italy,"Italy"));
        arrayList.add(new Bai3Country(R.drawable.ic_france,"France"));
        arrayList.add(new Bai3Country(R.drawable.ic_germany,"Germany"));
        arrayList.add(new Bai3Country(R.drawable.ic_sweden,"Sweden"));
        arrayList.add(new Bai3Country(R.drawable.ic_greece,"Greece"));
        arrayList.add(new Bai3Country(R.drawable.ic_ireland,"Ireland"));
        arrayList.add(new Bai3Country(R.drawable.ic_denmark,"Denmark"));
        arrayList.add(new Bai3Country(R.drawable.ic_russia,"Russia"));
        arrayList.add(new Bai3Country(R.drawable.ic_spain,"Spain"));
        arrayList.add(new Bai3Country(R.drawable.ic_portugal,"Portugal"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview3.setLayoutManager(linearLayoutManager);

        arrayAdapter = new Bai3myAdapter(this, arrayList);
        recyclerview3.setAdapter(arrayAdapter);

        BtnRemoveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.clear();
                arrayAdapter.notifyDataSetChanged();
            }
        });

        BtnRemoveSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i< arrayList.size(); i++){
                    if(arrayList.get(i).getChecked()){
                        arrayList.remove(i);
                        arrayAdapter.notifyDataSetChanged();

                    }
                }
            }

        });


    }
}