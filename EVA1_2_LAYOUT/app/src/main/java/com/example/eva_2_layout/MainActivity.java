package com.example.eva_2_layout;
/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1
*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTxtNom, edtTxtApe, edtTxtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //conecta componentes
        edtTxtApe = findViewById(R.id.edtTxtNo);
        edtTxtNom = findViewById(R.id.edtTxtNo);
        edtTxtEdad  = findViewById(R.id.edtTxtEdad);
    }
}
