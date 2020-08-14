package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class takepass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takepass);


        Button pasb= findViewById(R.id.btnp);

        pasb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 EditText pass=findViewById(R.id.editText);
                 String password=pass.getText().toString();

                 if(password.length()==5) {
                     SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
                     SharedPreferences.Editor editor = shrd.edit();
                     editor.putString("str", password);
                     editor.apply();


                     Intent call = new Intent(takepass.this, com.example.kydmedfinal.pass.class);
                     call.putExtra("MYPASS", password);
                     startActivity(call);
                     finish();
                 }
                 else
                 {
                     TextView we =  findViewById(R.id.textView9);
                     we.setText("Please enter 5 digit number!!");

                 }


            }
        });



    }
    public void back(View view)
    {
        Intent call =new Intent(takepass.this,MainActivity.class);
        startActivity(call);
        finish();
    }
}
