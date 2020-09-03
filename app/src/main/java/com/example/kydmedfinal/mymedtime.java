package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.SECOND;

public class mymedtime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymedtime);
       // createNotificationChannel();
        Toast.makeText(mymedtime.this,"To set your med routine go to med calender",Toast.LENGTH_SHORT).show();



//      preferneces
        final SharedPreferences getshared1 = getSharedPreferences("montime1",MODE_PRIVATE);
        final String value1 = getshared1.getString("str1","00:00");
        final SharedPreferences getshared2 = getSharedPreferences("montime2",MODE_PRIVATE);
        final String value2 = getshared2.getString("str2","00:00");
        final SharedPreferences getshared3 = getSharedPreferences("montime3",MODE_PRIVATE);
        final String value3 = getshared3.getString("str3","00:00");

        final SharedPreferences getshared4 = getSharedPreferences("tuetime1",MODE_PRIVATE);
        final String value4 = getshared4.getString("str1","00:00");
        final SharedPreferences getshared5 = getSharedPreferences("tuetime2",MODE_PRIVATE);
        final String value5 = getshared5.getString("str2","00:00");
        final SharedPreferences getshared6 = getSharedPreferences("tuetime3",MODE_PRIVATE);
        final String value6 = getshared6.getString("str3","00:00");

        final SharedPreferences getshared7 = getSharedPreferences("wedtime1",MODE_PRIVATE);
        final String value7 = getshared7.getString("str1","00:00");
        final SharedPreferences getshared8 = getSharedPreferences("wedtime2",MODE_PRIVATE);
        final String value8 = getshared8.getString("str2","00:00");
        final SharedPreferences getshared9= getSharedPreferences("wedtime3",MODE_PRIVATE);
        final String value9 = getshared9.getString("str3","00:00");


        final SharedPreferences getshared10 = getSharedPreferences("thutime1",MODE_PRIVATE);
        final String value10 = getshared10.getString("str1","00:00");
        final SharedPreferences getshared11 = getSharedPreferences("thutime2",MODE_PRIVATE);
        final String value11 = getshared11.getString("str2","00:00");
        final SharedPreferences getshared12 = getSharedPreferences("thutime3",MODE_PRIVATE);
        final String value12 = getshared12.getString("str3","00:00");



        final SharedPreferences getshared13 = getSharedPreferences("fritime1",MODE_PRIVATE);
        final String value13 = getshared13.getString("str1","00:00");
        final SharedPreferences getshared14 = getSharedPreferences("fritime2",MODE_PRIVATE);
        final String value14 = getshared14.getString("str2","00:00");
        final SharedPreferences getshared15 = getSharedPreferences("fritime3",MODE_PRIVATE);
        final String value15 = getshared15.getString("str3","00:00");


        final SharedPreferences getshared16 = getSharedPreferences("sattime1",MODE_PRIVATE);
        final String value16 = getshared16.getString("str1","00:00");
        final SharedPreferences getshared17 = getSharedPreferences("sattime2",MODE_PRIVATE);
        final String value17 = getshared17.getString("str2","00:00");
        final SharedPreferences getshared18 = getSharedPreferences("sattime3",MODE_PRIVATE);
        final String value18 = getshared18.getString("str3","00:00");


        final SharedPreferences getshared19 = getSharedPreferences("suntime1",MODE_PRIVATE);
        final String value19 = getshared19.getString("str1","00:00");
        final SharedPreferences getshared20 = getSharedPreferences("suntime2",MODE_PRIVATE);
        final String value20 = getshared20.getString("str2","00:00");
        final SharedPreferences getshared21 = getSharedPreferences("suntime3",MODE_PRIVATE);
        final String value21 = getshared21.getString("str3","00:00");



//

        TextView mont1= findViewById(R.id.mont1);
        TextView mont2= findViewById(R.id.mont2);
        TextView mont3= findViewById(R.id.mont3);
        TextView tuet1= findViewById(R.id.tuet1);
        TextView tuet2= findViewById(R.id.tuet2);
        TextView tuet3= findViewById(R.id.tuet3);
        TextView wedt1= findViewById(R.id.wedt1);
        TextView wedt2= findViewById(R.id.wedt2);
        TextView wedt3= findViewById(R.id.wedt3);
        TextView thut1= findViewById(R.id.thut1);
        TextView thut2= findViewById(R.id.thut2);
        TextView thut3= findViewById(R.id.thut3);
        TextView frit1= findViewById(R.id.frit1);
        TextView frit2= findViewById(R.id.frit2);
        TextView frit3= findViewById(R.id.frit3);
        TextView satt1= findViewById(R.id.satt1);
        TextView satt2= findViewById(R.id.satt2);
        TextView satt3= findViewById(R.id.satt3);
        TextView sunt1= findViewById(R.id.sunt1);
        TextView sunt2= findViewById(R.id.sunt2);
        TextView sunt3= findViewById(R.id.sunt3);

        mont1.setText(value1);
        mont2.setText(value2);
        mont3.setText(value3);

        tuet1.setText(value4);
        tuet2.setText(value5);
        tuet3.setText(value6);

        wedt1.setText(value7);
        wedt2.setText(value8);
        wedt3.setText(value9);

        thut1.setText(value10);
        thut2.setText(value11);
        thut3.setText(value12);


        frit1.setText(value13);
        frit2.setText(value14);
        frit3.setText(value15);

        satt1.setText(value16);
        satt2.setText(value17);
        satt3.setText(value18);

        sunt1.setText(value19);
        sunt2.setText(value20);
        sunt3.setText(value21);


    }
//    private void createNotificationChannel(){
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
//        {
//            CharSequence name ="lemubit";
//            String description ="cahnnel";
//            int importance = NotificationManager.IMPORTANCE_DEFAULT;
//            NotificationChannel channel = new NotificationChannel("notifylemubit2",name,importance);
//            channel.setDescription(description);
//
//            NotificationManager notificationManager =getSystemService(NotificationManager.class);
//            notificationManager.createNotificationChannel(channel);
//        }
//    }
}
