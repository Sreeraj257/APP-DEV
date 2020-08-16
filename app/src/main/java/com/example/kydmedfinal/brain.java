package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class brain extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain);

        Button Sys = findViewById(R.id.SYMB);
        Button Cau = findViewById(R.id.CAUB);
        Button kill = findViewById(R.id.mi);

        Sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golo();
            }
        });
        Cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                molo();
            }
        });
        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.healthline.com/health/brain-tumor");
                Intent nr =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(nr);
            }
        });


    }
    public void golo()
    {
        TextView t1 = findViewById(R.id.tB);
        t1.setText("1.Headaches, which may be severe and worsen with activity or in the early morning.\n2.Seizures. People may experience different types of seizures. Certain drugs can help prevent or control them.\n3.Personality or memory changes.\n4.Nausea or vomiting.\n5.Fatigue.\n6.Drowsiness.\n7.Sleep problems.\n8.Memory problems ");
    }

    public void molo()
    {
        TextView t1 = findViewById(R.id.tB);
        t1.setText("The exact cause of brain cancer is unknown. However, factors that can increase your risk of brain cancer include exposure to high doses of ionizing radiation and a family history of brain cancer. Cancer in another part of your body is also a risk factor.");
    }



}

