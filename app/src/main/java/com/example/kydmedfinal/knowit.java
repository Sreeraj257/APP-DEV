package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class knowit extends AppCompatActivity {
    RadioButton radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowit);








    }

    public void opacity(View view) {

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
    public void takeback(View view)
    {
        Intent call = new Intent(knowit.this,MainActivity.class);
        startActivity(call);
        finish();
    }
}
