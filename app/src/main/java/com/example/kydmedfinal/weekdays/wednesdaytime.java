package com.example.kydmedfinal.weekdays;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.kydmedfinal.R;

import java.util.Calendar;

public class wednesdaytime extends AppCompatActivity {
    TextView textView;
    Button button;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesdaytime);
        textView=findViewById(R.id.ttime1);
        button = findViewById(R.id.time1);

        final TextView textView2=findViewById(R.id.ttime2);
        Button button2 = findViewById(R.id.time2);

        final TextView textView3=findViewById(R.id.ttime3);
        Button button3 = findViewById(R.id.time3);
        context=this;
        Calendar calendar =Calendar.getInstance();
        final int hour =calendar.get(Calendar.HOUR_OF_DAY);
        final int minute =calendar.get(Calendar.MINUTE);

        final SharedPreferences getshared1 = getSharedPreferences("wedtime1",MODE_PRIVATE);
        final String value1 = getshared1.getString("str1","0");
        final SharedPreferences getshared2 = getSharedPreferences("wedtime2",MODE_PRIVATE);
        final String value2 = getshared2.getString("str2","0");
        final SharedPreferences getshared3 = getSharedPreferences("wedtime3",MODE_PRIVATE);
        final String value3 = getshared3.getString("str3","0");




        if(value1.equals(0))
        {
            textView.setHint("00:00");
        }
        else
            textView.setHint(value1);

        if(value1.equals(0))
        {
            textView2.setHint("00:00");
        }
        else
            textView2.setHint(value2);

        if(value1.equals(0))
        {
            textView3.setHint("00:00");
        }
        else
            textView3.setHint(value3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences getshared1 = getSharedPreferences("wedtime1",MODE_PRIVATE);
                String value1 = getshared1.getString("str1","0");



                if(value1.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("wedtime1", MODE_PRIVATE);
                            SharedPreferences.Editor editor = shrd.edit();
                            editor.putString("str1", hourOfDay + ":" + minute);
                            editor.apply();


                        }
                    }, hour, minute, android.text.format.DateFormat.is24HourFormat(context));
                    timePickerDialog.show();
                }


            }
        });




        //second button


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences getshared2 = getSharedPreferences("wedtime2",MODE_PRIVATE);
                String value2 = getshared2.getString("str2","0");

                if(value2.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView2.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("wedtime2", MODE_PRIVATE);
                            SharedPreferences.Editor editor = shrd.edit();
                            editor.putString("str2", hourOfDay + ":" + minute);
                            editor.apply();


                        }
                    }, hour, minute, android.text.format.DateFormat.is24HourFormat(context));
                    timePickerDialog.show();
                }



            }
        });



        //second button


        //third button

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences getshared3 = getSharedPreferences("wedtime3",MODE_PRIVATE);
                String value3 = getshared3.getString("str3","0");

                if(value3.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView3.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("wedtime3", MODE_PRIVATE);
                            SharedPreferences.Editor editor = shrd.edit();
                            editor.putString("str3", hourOfDay + ":" + minute);
                            editor.apply();


                        }
                    }, hour, minute, android.text.format.DateFormat.is24HourFormat(context));
                    timePickerDialog.show();
                }


            }
        });

        //reset

        Button button=findViewById(R.id.reset1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor =getshared1.edit();
                editor.clear();
                editor.apply();
                SharedPreferences.Editor editor1 =getshared2.edit();
                editor1.clear();
                editor1.apply();
                SharedPreferences.Editor editor2 =getshared3.edit();
                editor2.clear();
                editor2.apply();





                textView.setHint("00:00");
                textView2.setHint("00:00");
                textView3.setHint("00:00");


            }
        });
    }
}
