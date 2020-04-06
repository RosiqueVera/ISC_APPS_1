package com.example.eva2_7_bundles_extras;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        datos = findViewById(R.id.datos);
        Intent inDatos = getIntent();
        String texto = inDatos.getStringExtra("Mensaje");                                     //Obtenemos el extra mediante el nombre que le asignamos como palabra clave
        Bundle stringBundle = inDatos.getExtras();
        datos.setText(texto);
        datos.append("\n");
        datos.append(stringBundle.getString("usingBundle"));                                    //Mostramos el Bundle generado en la primer clase mediante el key "usingBundle"
    }
}
