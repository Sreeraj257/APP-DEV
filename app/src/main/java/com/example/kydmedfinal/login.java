package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class login extends AppCompatActivity {
    Toolbar t;
    DrawerLayout drawer;
    EditText nametext;
    EditText agetext;
    ImageView enter;
    RadioButton male;
    RadioButton female;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t =  findViewById(R.id.toolbar);
        nametext = findViewById(R.id.nametext);
        agetext = findViewById(R.id.agetext);
        enter = findViewById(R.id.imageView7);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        rg=findViewById(R.id.rg1);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nametext.getText().toString();
                String age = agetext.getText().toString();
                String gender= new String();
                int id=rg.getCheckedRadioButtonId();
                switch(id)
                {
                    case R.id.male:
                        gender = "Mr.";
                        break;
                    case R.id.female:
                        gender = "Ms.";
                        break;
                }

//                SharedPreferences getshared1 = getSharedPreferences("logname",MODE_PRIVATE);
//                String value1 = getshared1.getString("str1","0");

                SharedPreferences shrd = getSharedPreferences("logname", MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString("str1",name);
                editor.apply();

                SharedPreferences shrd2= getSharedPreferences("logname1",MODE_PRIVATE);
                SharedPreferences.Editor editor1=shrd2.edit();
                editor1.putString("str2",gender);
                editor1.apply();



                Intent symp = new Intent(login.this,MainActivity.class);
//                symp.putExtra("name",name);
//                symp.putExtra("gender",gender);
//                symp.putExtra("age",age);
                startActivity(symp);

            }
        });





    }
}
