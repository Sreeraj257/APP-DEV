package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Map;


public class MainActivity extends AppCompatActivity {

    RadioButton radio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton hea =  findViewById(R.id.hea);
        hea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hear();
            }
        });


        Button get = findViewById(R.id.podapatti);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opacity();




            }
        });

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




    public void opacity() {

        RadioGroup red =  findViewById(R.id.rusted);
        RadioButton Can = findViewById(R.id.can);
        RadioButton Aid = findViewById(R.id.aid);
        RadioButton Liv = findViewById(R.id.liv);
        RadioButton Kid = findViewById(R.id.kid);
        RadioButton Bra = findViewById(R.id.bra);


        int rand = red.getCheckedRadioButtonId();
        radio = findViewById(rand);



           if(radio.getText() == Can.getText())
         {
             Toast.makeText(this,"You have selected: "+radio.getText(),Toast.LENGTH_SHORT).show();
           Intent mall = new Intent(this, cancer.class);
         startActivity(mall);
        }
        if(radio.getText() == Aid.getText())
        {        Toast.makeText(this,"You have selected: "+radio.getText(),Toast.LENGTH_SHORT).show();

            Intent pall = new Intent(this,aids.class);
        startActivity(pall);
        }
        if(radio.getText() == Liv.getText())
        {   Toast.makeText(this,"You have selected: "+radio.getText(),Toast.LENGTH_SHORT).show();
            Intent pall = new Intent(this,liver.class);
            startActivity(pall);
        }
        if(radio.getText() == Kid.getText())
        {   Toast.makeText(this,"You have selected: "+radio.getText(),Toast.LENGTH_SHORT).show();
            Intent pall = new Intent(this,kidney.class);
            startActivity(pall);
        }
        if(radio.getText() == Bra.getText())
        {   Toast.makeText(this,"You have selected: "+radio.getText(),Toast.LENGTH_SHORT).show();
            Intent pall = new Intent(this,brain.class);
            startActivity(pall);
        }




    }

    public void hear()
    {

            Intent call = new Intent(this, amp.class);
            startActivity(call);
        }
    public void google(View view)
    {

        Intent call1 = new Intent(this, MapActivity.class);
        startActivity(call1);
    }


}
