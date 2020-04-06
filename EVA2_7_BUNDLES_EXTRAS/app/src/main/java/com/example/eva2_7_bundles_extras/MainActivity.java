
package com.example.eva2_7_bundles_extras;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNombre;
    //quien lanza el contexto y a donde

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtNombre = findViewById(R.id.txtNombre);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                Bundle bundle = new Bundle();                                                       //Generamos el Bundle a usar en el intento
            bundle.putString("usingBundle", nombre);                                                //Colocamos un string en el bundle con su "key", en el cual asignamos el texto del edditText
                Intent intent = new Intent(getApplicationContext(), SecondaryActivity.class);       //intento funciona como intermediario
                intent.putExtra("Mensaje", nombre);
                intent.putExtras(bundle);                                                           //Le agregamos el extra al Intent
                startActivity(intent);
            }
        });

    }
}
