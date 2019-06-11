package com.example.sarana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Inicio(View view){
        Intent i=new Intent(getApplicationContext(),Inicia.class);
        startActivity(i);
    }

    public void Registrate(View view){
        Intent i=new Intent(getApplicationContext(),Registrate.class);
        startActivity(i);
    }

}
