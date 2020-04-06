package com.example.eva2_4_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
   // Intent inMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //inMain = new Intent(this,MainActivity.class);
    }
    public void onclick(View v){
        //Con esto vamos a finalizar la actividad sacandola de la stack de actividades
        finish();
        //La siguiente instrucción va a consumir recursos por estar lanzando multiples actividades lo cual va a causar consumo de memoria excesiva
        //startActivity(inMain);
    }
}
