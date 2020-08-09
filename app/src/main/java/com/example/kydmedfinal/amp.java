package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        Button score =findViewById(R.id.button5);
        Button band =findViewById(R.id.button3);






        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText great = findViewById(R.id.editText2);
                TextView old =findViewById(R.id.tH);
                Double m = Double.valueOf(String.valueOf(great.getText()));
                if(String.valueOf(great.getText()) == "\u0000")
                {
                    old.setText("Enter a value first!!");

                }
                if(m<=40)
                {
                    old.setText("PERFECT");

                }
                if(m>40 && m<50)
                {
                    old.setText("VERY VERY GOOD");

                }
                if(m>=50&&m<60)
                {
                    old.setText("AVERAGE");

                }
                if(m>=60&&m<70)
                {
                    old.setText("FAIR");

                }
                if(m>=70)
                {
                    old.setText("POOR");

                }
            }
        });




    }
    public  void  play(View v)
    {   Toast.makeText(this,"Use earphones for accurate results",Toast.LENGTH_SHORT).show();

         if(isvalid==2)
         {
             isvalid=0;
             counter=pausevalue;
         }
         player.start();


        TextView textView= (TextView) findViewById(R.id.textView);
        new CountDownTimer(120000, 1000){
            public void onTick(long millisUntilFinished){
                TextView textView= findViewById(R.id.textView);
                if(isvalid==0) {
                    textView.setText(String.valueOf(counter));
                    counter++;
                }
                else if(isvalid==1)
                {
                    onFinish();

                }
                else if(isvalid==2)
                {
                    TextView o =findViewById(R.id.textView);
                    o.setText(String.valueOf(counter));
                    pausevalue=counter;

                }
            }
            public  void onFinish(){
                TextView textView= (TextView) findViewById(R.id.textView);

                textView.setText("0");
            }




        }.start();

    }




    public void  pause(View v)
    {
        isvalid=2;
        player.pause();
    }
    public void  stop(View v)
    {
        isvalid=1;
        player.stop();

    }
}
