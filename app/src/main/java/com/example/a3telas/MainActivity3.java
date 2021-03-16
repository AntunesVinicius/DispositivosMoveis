package com.example.a3telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btLogin, btSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btLogin = (Button)findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent telaLogin = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(telaLogin);
            }
        });

        btSplash = (Button)findViewById(R.id.btSplash);
        btSplash.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent telaSplash = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(telaSplash);
            }
        });
    }
}