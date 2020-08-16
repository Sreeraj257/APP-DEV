package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class amp extends AppCompatActivity {
    MediaPlayer player;
    public int counter;
    int isvalid=0;
    int pausevalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amp);
        player = MediaPlayer.create(this,R.raw.hear);
        final Button score =findViewById(R.id.button5);
        Button band =findViewById(R.id.button3);



        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                player.stop();
                 EditText great = findViewById(R.id.editText2);

                great.setCursorVisible(false);
                TextView old =findViewById(R.id.tH);
                Double m = Double.valueOf(String.valueOf(great.getText()));
                if(String.valueOf(great.getText()) == "\u0000")
                {
                    old.setText("Enter a value first!!");

                }
                if(m<=40)
                {
                    old.setTextColor(Color.GREEN);
                    old.setText("PERFECT");

                }
                if(m>40 && m<50)
                {
                    old.setTextColor(Color.BLUE);
                    old.setText("VERY VERY GOOD");

                }
                if(m>=50&&m<60)
                {
                    old.setTextColor(Color.YELLOW);
                    old.setText("AVERAGE");

                }
                if(m>=60&&m<70)
                {
                    old.setTextColor(Color.YELLOW);
                    old.setText("FAIR");

                }
                if(m>=70)
                {
                    old.setTextColor(Color.RED);
                    old.setText("POOR");

                }
            }
        });




    }
    public  void  play(View v)
    {

        if(!player.isPlaying()) {

            if(isvalid==2)
            {
                Toast.makeText(this,"Press the reset button !!",Toast.LENGTH_SHORT).show();
            }
            if (isvalid == 0 || isvalid == 1) {
                Toast.makeText(this,"Use earphones for accurate results",Toast.LENGTH_SHORT).show();
                if (isvalid == 1)
                    isvalid = 0;

                player.start();


                final TextView textView = findViewById(R.id.textView);
                new CountDownTimer(120000, 1000) {
                    public void onTick(long millisUntilFinished) {

                        if (isvalid == 0) {
                            textView.setText(String.valueOf(counter));
                            counter++;
                        } else if (isvalid == 2) {

                            TextView o = findViewById(R.id.textView);
                            o.setText(String.valueOf(counter));

                        } else if (isvalid == 1) {
                            counter = 0;
                            EditText great = findViewById(R.id.editText2);
                            great.setText(null);
                            isvalid=1;
                            TextView textView1 = findViewById(R.id.textView);
                            textView1.setText("0");

                            great.setText("0");
                            player.stop();

                           cancel();
                        }
                    }

                    public void onFinish() {

                        TextView textView = findViewById(R.id.textView);

                        textView.setText("Time is too long consult yor ear docter soon!!");
                        textView.setTextColor(Integer.parseInt("#bdbdbd"));
                        player.stop();
                        counter = 0;
                        isvalid = 0;

                    }
                }.start();
            }
        }
        else
        {
            Toast.makeText(this,"Frequency is playing, wait till you hear a sound!!",Toast.LENGTH_SHORT).show();
        }

    }

    public void  pause(View v)
    {
        isvalid=2;
        player.pause();
    }
    public void  stop(View v)
    {


        isvalid=1;



    }
    public void back(View view)
    {
        Intent call =new Intent(amp.this,MainActivity.class);
        startActivity(call);
        finish();
    }
    public void info(View view)
    {
        Intent call =new Intent(amp.this,coloramp.class);
        startActivity(call);
        finish();
    }
}
