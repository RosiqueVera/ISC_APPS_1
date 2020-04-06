package com.example.eva2_5_contactos;
/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch = findViewById(R.id.btnShowContacts);

        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String contactStatement = "content://contacts/people/";                                     //Preparamos la ruta de los contactos
        Intent intentViewContact = new Intent(Intent.ACTION_VIEW, Uri.parse(contactStatement));     //Generamos el intento con un ActionView que va a recibír como URI la ruta que definimos
        startActivity(intentViewContact);                                                           //Lanzamos el intento
    }
}
