package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kidney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney);
        Button Sys = findViewById(R.id.SYMK);
        Button Cau = findViewById(R.id.CAUK);
        Button si =findViewById(R.id.mik);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.kidneyfund.org/kidney-disease/kidney-problems/kidney-stones/");
                Intent se = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(se);
            }
        });
        Sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tera();

            }
        });
        Cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mera();
            }
        });
    }


    public void tera()
    {
        TextView t1 = findViewById(R.id.tk);
        t1.setText("1.Severe pain in the groin and/or side.\n2.blood in urine.\n3.vomiting and nausea.\n4.white blood cells or pus in the urine.\n5.reduced amount of urine excreted.\n6.burning sensation during urination.\n7.persistent urge to urinate.\n8.fever and chills if there is an infection");
    }

    public void mera()
    {
        TextView t1 = findViewById(R.id.tk);
        t1.setText("The leading cause of kidney stones is a lack of water in the body.");
    }
}
