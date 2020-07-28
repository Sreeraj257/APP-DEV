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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amp);
        player = MediaPlayer.create(this,R.raw.hear);
        Button score =findViewById(R.id.button5);

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

        player.start();
        TextView textView= (TextView) findViewById(R.id.textView);
        new CountDownTimer(120000, 1000){
            public void onTick(long millisUntilFinished){
                TextView textView= findViewById(R.id.textView);

                textView.setText(String.valueOf(counter));
                counter++;
            }
            public  void onFinish(){
                TextView textView= (TextView) findViewById(R.id.textView);

                textView.setText("FINISH!!");
            }
        }.start();
    }




    public void  pause(View v)
    {
        player.pause();
    }
    public void  stop(View v)
    {
        player.stop();
    }
}
