package com.example.eva2_6_web_page;
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

    EditText txtValidUrl;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValidUrl = findViewById(R.id.txtUrl);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String validUrl = "http://www." + txtValidUrl.getText().toString();                         //preparamos la ruta de la pagina a mostrar agregando el "http:// y tomando el texto del edditTetxt
        Intent intentWebPage = new Intent(Intent.ACTION_VIEW, Uri.parse(validUrl));                 //asignamos la URI que es la ruta preparada al Inetento igual que será un ActivonView como el ejercicio anterior
        startActivity(intentWebPage);
    }
}
