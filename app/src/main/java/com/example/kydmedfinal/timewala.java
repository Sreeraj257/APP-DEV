package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.widget.ArrayAdapter;

import com.example.kydmedfinal.adapter.RecycleViewAdapter;
import com.example.kydmedfinal.weekdays.fridaytime;
import com.example.kydmedfinal.weekdays.saturdaytime;
import com.example.kydmedfinal.weekdays.sundaytime;
import com.example.kydmedfinal.weekdays.thursdaytime;
import com.example.kydmedfinal.weekdays.tuesdaytime;
import com.example.kydmedfinal.weekdays.wednesdaytime;

import java.util.ArrayList;
import java.util.List;

public class timewala extends AppCompatActivity implements RecyclerViewInterface {
    private RecyclerView recyclerView;
    List<String> week;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timewala);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        week=new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        String week1[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        recyclerView.setAdapter(new RecycleViewAdapter(week1,this));



    }

    @Override
    public void onItemClick(int position) {
        String s= week.get(position);
        if(s.equals("Monday"))
        {
            Intent call = new Intent(timewala.this,mondaytime.class);
            startActivity(call);
        }
        if(s.equals("Tuesday"))
        {
            Intent call = new Intent(timewala.this, tuesdaytime.class);
            startActivity(call);
        }
        if(s.equals("Wednesday"))
        {
            Intent call = new Intent(timewala.this, wednesdaytime.class);
            startActivity(call);
        }
        if(s.equals("Thursday"))
        {
            Intent call = new Intent(timewala.this, thursdaytime.class);
            startActivity(call);
        }
        if(s.equals("Friday"))
        {
            Intent call = new Intent(timewala.this, fridaytime.class);
            startActivity(call);
        }
        if(s.equals("Saturday"))
        {
            Intent call = new Intent(timewala.this, saturdaytime.class);
            startActivity(call);
        }
        if(s.equals("Sunday"))
        {
            Intent call = new Intent(timewala.this, sundaytime.class);
            startActivity(call);
        }





    }

//    @Override
//    public void onLongItemClick(int position) {
//
//    }
}
