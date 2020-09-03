package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences getshared1 = getSharedPreferences("logname",MODE_PRIVATE);
        String value1 = getshared1.getString("str1","0");
        if(value1=="0")
        {
            Intent call = new Intent(MainActivity.this,login.class);
            startActivity(call);
        }








        Button emer =findViewById(R.id.e1);
        {
            emer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri destination =Uri.parse("smsto:");
                    Intent sms1 =new Intent(Intent.ACTION_SENDTO,destination);
                    sms1.putExtra("sms_body","Help! Its An  EMERGENCY I Need Your Help");
                    startActivity(sms1);

                }
            });
        }



    }







    public void hear(View view)
    {



            Intent call = new Intent(this, amp.class);
            startActivity(call);
        }
        public void google(View view)
        {
            Intent call = new Intent(this, MapActivity.class);
            startActivity(call);
        }
    public void common(View view)
    {

        Intent call1 = new Intent(this, knowit.class);
        startActivity(call1);


    }
    public void calender(View view)
    {
        Intent call =new Intent(MainActivity.this,pass.class);
        startActivity(call);

    }
    public void passnew(View view)
    {
        SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
        SharedPreferences.Editor editor = shrd.edit();
        editor.clear();
        Intent call = new Intent(MainActivity.this,takepass.class);
        startActivity(call);


    }
    public void medshop(View view)
    {
        Uri uri = Uri.parse("https://www.medlife.com");
        Intent see = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(see);
    }
    public void vidd(View view)
    {
        Intent intent=new Intent(MainActivity.this,mymedtime.class);
        startActivity(intent);
    }

    public void check(View view)
    {
        Intent call = new Intent(MainActivity.this,symptoms.class);
        startActivity(call);
    }






}
