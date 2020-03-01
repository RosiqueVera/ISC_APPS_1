package com.example.eva1_7_orientation;
/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_Mens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Mens = findViewById(R.id.Mensaje);
        btn_Mens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),btn_Mens.getText()+"",Toast.LENGTH_SHORT).show();    //Lo que hacemos aqui es que dependiendo de la orientación del telefono vamos a desplegar un mensaje que nos va a indicar en que orientación estamos por el texto que contendrá el botón con el mismo ID en cada una de las orientaciones
            }
        });
    }

}
