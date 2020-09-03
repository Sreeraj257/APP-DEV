package com.example.kydmedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webactivity);
        WebView webView =findViewById(R.id.webv);
        WebSettings websettings = webView.getSettings();

        websettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com/search?q=hospitals+near+me");
    }
}
