package com.example.eva_1__5_radio_group;

import androidx.appcompat.app.AppCompatActivity;


/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1
* */
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup Marcas;                                                                              //Iniciamos una variable  para referenciar alradiogroup quetenemos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Marcas = findViewById(R.id.Marcas);                                                         //Referenciamos mediante el ID del componente con la variable que creamos
        Marcas.setOnCheckedChangeListener(this);                                                    //Método que va a detectar  un cambio entre la selección de nuestro grupo de botones
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {                                 //Método sobre escrito que nos devuelve el ID del botón seleccionado
        RadioButton rbtn=findViewById(checkedId);                                                   //Creamos un botón para poder referenciarnos a él más facilmente mediante elID que nos arroja el métodi
        Toast.makeText(this,rbtn.getText(),Toast.LENGTH_SHORT).show();                             //Desplegamos un mensaje con el texto del botón seleccionado
    }
}
