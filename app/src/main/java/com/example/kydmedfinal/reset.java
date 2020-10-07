package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class reset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);


        SharedPreferences shrd = getSharedPreferences("logname1", MODE_PRIVATE);
        SharedPreferences.Editor editor = shrd.edit();
        editor.clear();
        editor.apply();

        SharedPreferences getshared1 = getSharedPreferences("logname",MODE_PRIVATE);
        SharedPreferences.Editor editor1=getshared1.edit();
        editor1.clear();
        editor1.apply();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent call =new Intent(reset.this,MainActivity.class);
                startActivity(call);
                finish();

            }
        },2000);


    }
}
