package com.example.kydmedfinal.weekdays;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kydmedfinal.R;
import com.example.kydmedfinal.mondaytime;

import java.util.Calendar;

import static android.content.Context.MODE_PRIVATE;

public class tuesdaytime extends AppCompatActivity {
    TextView textView;
    Button button;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mondaytime);



        textView=findViewById(R.id.ttime1);
        button = findViewById(R.id.time1);


        final TextView textView2=findViewById(R.id.ttime2);
        Button button2 = findViewById(R.id.time2);

        final TextView textView3=findViewById(R.id.ttime3);
        Button button3 = findViewById(R.id.time3);
        context=this;
        final Calendar calendar =Calendar.getInstance();
        final int hour =calendar.get(Calendar.HOUR_OF_DAY);
        final int minute =calendar.get(Calendar.MINUTE);

        final SharedPreferences getshared100 = getSharedPreferences("tuetime1",MODE_PRIVATE);
        final String value1 = getshared100.getString("str1","0");
        final SharedPreferences getshared200 = getSharedPreferences("tuetime2",MODE_PRIVATE);
        final String value2 = getshared200.getString("str2","0");
        final SharedPreferences getshared300 = getSharedPreferences("tuetime3",MODE_PRIVATE);
        final String value3 = getshared300.getString("str3","0");




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
                SharedPreferences getshared100 = getSharedPreferences("tuetime1",MODE_PRIVATE);
                String value1 = getshared100.getString("str1","0");



                if(value1.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("tuetime1", MODE_PRIVATE);
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
                SharedPreferences getshared200= getSharedPreferences("tuetime2",MODE_PRIVATE);
                String value2 = getshared200.getString("str2","0");

                if(value2.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView2.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("tuetime2", MODE_PRIVATE);
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
                SharedPreferences getshared300 = getSharedPreferences("tuetime3",MODE_PRIVATE);
                String value3 = getshared300.getString("str3","0");

                if(value3.equals("0")) {

                    TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            textView3.setText(hourOfDay + ":" + minute);


                            SharedPreferences shrd = getSharedPreferences("tuetime3", MODE_PRIVATE);
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
                SharedPreferences.Editor editor =getshared100.edit();
                editor.clear();
                editor.apply();
                SharedPreferences.Editor editor1 =getshared200.edit();
                editor1.clear();
                editor1.apply();
                SharedPreferences.Editor editor2 =getshared300.edit();
                editor2.clear();
                editor2.apply();





                textView.setHint("00:00");
                textView2.setHint("00:00");
                textView3.setHint("00:00");


            }
        });

        //
        Button button1=findViewById(R.id.time8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(tuesdaytime.this,"Time Saved",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(mondaytime.this, RemainderBroadcast1.class);
//                PendingIntent pendingIntent =PendingIntent.getBroadcast(mondaytime.this,0,intent,0);
//                AlarmManager alarmManager =(AlarmManager) getSystemService(ALARM_SERVICE);
//                long timebu=System.currentTimeMillis();
//                long timenw=10*1000;
//
//
//                Calendar calendar1=Calendar.getInstance();
//                calendar1.set(HOUR_OF_DAY,14);
//                calendar1.set(MINUTE,29);
//                calendar1.set(SECOND,0);
//                long real=calendar1.getTimeInMillis();
//
//                alarmManager.set(AlarmManager.RTC_WAKEUP,timebu+timenw,pendingIntent);

            }
        });





    }

}
