package com.example.sarana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pasa_la_tarjeta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasa_la_tarjeta);
    }

    public void Success(View view){
        Intent i=new Intent(getApplicationContext(),Transaction_success.class);
        startActivity(i);
    }

    public void Failure(View view){
        Intent i=new Intent(getApplicationContext(),Transaction_fail.class);
        startActivity(i);
    }
}
