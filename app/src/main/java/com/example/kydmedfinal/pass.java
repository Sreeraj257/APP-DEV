package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hanks.passcodeview.PasscodeView;

public class pass extends AppCompatActivity {
    PasscodeView passcodeView;
    //String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        passcodeView =findViewById(R.id.passcodeView);

        SharedPreferences getshared = getSharedPreferences("demo",MODE_PRIVATE);
        String value = getshared.getString("str","0");




  if(value=="0") {
      Intent call = new Intent(pass.this, takepass.class);
      startActivity(call);
      finish();


  }
  else {


      passcodeView.setPasscodeLength(value.length()).setLocalPasscode(value).setListener(new PasscodeView.PasscodeViewListener() {
          @Override
          public void onFail() {
              Toast.makeText(pass.this, "Password is incorrect", Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onSuccess(String number) {
              Intent call = new Intent(pass.this, timewala.class);
              startActivity(call);
              finish();

          }
      });
  }

    }
    public void passnew(View view)
    {
        SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
        SharedPreferences.Editor editor = shrd.edit();
        editor.clear();
        Intent call = new Intent(pass.this,takepass.class);
        startActivity(call);
        finish();

    }
}
