package com.example.t2u2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = (EditText) findViewById(R.id.url);

    }
    public void boton (View view){
        String enlace = url.getText().toString();
        Intent x=new Intent(this,Actividad2.class);
        x.putExtra("pagina", enlace);
        startActivity(x);

    }
}