package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aids);

        Button Sys = findViewById(R.id.SYS);
        Button Cau = findViewById(R.id.CAU);
        Button aid=findViewById(R.id.mia);
        aid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.healthline.com/health/hiv-aids");
                Intent id = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(id);
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
        TextView t1 = findViewById(R.id.T1);
        t1.setText("1.Rapid weight loss.2.Recurring fever or profuse night sweats.3.Extreme and unexplained tiredness.4.Prolonged swelling of the lymph glands in the armpits, groin, or neck.5.Diarrhea that lasts for more than a week.6.Sores of the mouth, anus, or genitals.7.Pneumonia.");
    }

    public void mera()
    {
        TextView t1 = findViewById(R.id.T1);
        t1.setText("A person with HIV can pass the virus on to others even if they don't have any symptoms. People with HIV can pass the virus on more easily in the weeks following infection.HIV treatment significantly reduces the risk of someone with HIV passing it on.");
    }




}
