package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.kydmedfinal.adapter.RecycleViewAdapter;

import java.util.ArrayList;

public class timewala extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timewala);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String week[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        recyclerView.setAdapter(new RecycleViewAdapter(week));



    }
}
