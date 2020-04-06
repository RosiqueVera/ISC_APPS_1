package com.example.eva2_4_intents;

/*
Oscar Alejandro Rosique Vera
17550484
ISC
APP1
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
Intent inLanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Este es un intento explicito en donde indicamos que aplicación va a ejecutar el intento.
          Para este caso vamos a hacerlo desde esta actividad y va a lanzar nuestra nueva actividad
          que sería el segundo parametro recibido
        */
        inLanzar = new Intent(this,Main2Activity.class);
    }
    public void onClick(View v){
    startActivity(inLanzar);
    }
}
