package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cancer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer2);
        Button Sys = findViewById(R.id.SYMC);
        Button Cau = findViewById(R.id.CAUC);
        Button se =findViewById(R.id.mic);

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.cancer.net/navigating-cancer-care/cancer-basics/what-cancer");
                Intent see = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(see);
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
        TextView t1 = findViewById(R.id.tc);
        t1.setText("1.Persistent cough or blood-tinged saliva. \n2.A change in bowel habits.\n3.Blood in the stool.\n4.Unexplained anemia (low blood count).\n5.Breast lump or breast discharge.\n6.Lumps in the testicles.\n7.A change in urination.");
    }

    public void mera()
    {
        TextView t1 = findViewById(R.id.tc);
        t1.setText("The substances that cause cancer are called carcinogens. A carcinogen may be a chemical substance, such as certain molecules in tobacco smoke. The cause of cancer may be environmental agents, viral or genetic factors .We should bear in mind, though, that in the majority of cancer cases we cannot attribute the disease to a single cause.");
    }
}
