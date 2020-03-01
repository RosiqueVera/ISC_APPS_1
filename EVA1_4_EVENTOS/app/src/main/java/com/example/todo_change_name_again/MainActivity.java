//EVENTOS
package com.example.todo_change_name_again;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button btnListener;
    Button btnAnonima;
    Button btnClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnAnonima = findViewById(R.id.btnAnonima);
        btnClase = findViewById(R.id.btnClase);

        btnListener.setOnClickListener(this);
        btnAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Por Clase Anonima", Toast.LENGTH_LONG).show();
            }
        });
        btnClase.setOnClickListener(new MiClickListener(getApplicationContext()));


    }

    public void miClick(View v){
        Toast.makeText(this, "Por XML Baby", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Por Listener", Toast.LENGTH_LONG).show();
    }
}
