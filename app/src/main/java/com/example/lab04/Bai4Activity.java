package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai4Activity extends AppCompatActivity {
    private RecyclerView recyclerview4;
    private ArrayList arrayList;
    Bai4myAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        recyclerview4 = findViewById(R.id.recyclerview4);

        ArrayList<PersonBai4> arrayList = new ArrayList<>();
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person1"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person2"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person3"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person4"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person5"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person6"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person7"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person8"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person9"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person10"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person11"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person12"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person13"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person14"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person15"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person16"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person17"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person18"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person19"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person20"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person21"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person22"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person23"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person24"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person25"));
        arrayList.add(new PersonBai4(R.drawable.ic_personcolor,"Person26"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview4.setLayoutManager(linearLayoutManager);

        final GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview4.setLayoutManager(layoutManager);

        arrayAdapter = new Bai4myAdapter(this, arrayList);
        recyclerview4.setAdapter(arrayAdapter);

    }
}