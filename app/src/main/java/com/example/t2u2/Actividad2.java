package com.example.t2u2;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Actividad2 extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        web = (WebView) findViewById(R.id.web);

        Bundle bundle = getIntent().getExtras();
        String enlace = bundle.getString("pagina");
        web.loadUrl("https://"+enlace);
    }


}