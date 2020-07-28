package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class liver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liver);
        Button Sys = findViewById(R.id.SYSL);
        Button Cau = findViewById(R.id.CAUL);
        Button miL = findViewById(R.id.mil);
        miL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri =Uri.parse("https://www.medicinenet.com/cirrhosis/article.htm");
                Intent er =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(er);
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
        TextView t1 = findViewById(R.id.tL);
        t1.setText("1.yellowing of the skin (jaundice) due to the accumulation of bilirubin in the blood.2.Fatigue.3.Weakness.4.Loss of appetite.5.Itching.6. Easy bruising from decreased production of blood clotting factors by the diseased liver.");
    }

    public void mera()
    {
        TextView t1 = findViewById(R.id.tL);
        t1.setText("Cirrhosis is a late stage of scarring (fibrosis) of the liver caused by many forms of liver diseases and conditions, such as hepatitis and chronic alcoholism. Each time your liver is injured  whether by disease, excessive alcohol consumption or another cause it tries to repair itself.");
    }

}
