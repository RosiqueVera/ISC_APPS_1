/**
 * EVA1_6_IDIOMA - using string resources to change the language in an app
 * <p>
 * written by: Luis Carlos Cruz Castillo
 * 17550448
 * APPS1
 * 01/03/2020
 */
package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1*/

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    /*
    * Creamos las variables para vincular  el objeto de nuestra interfaz*/
    TextView txtIdioma;
    TextView txtNombre;
    TextView txtApellido;
    TextView txtEdad;
    TextView lblNombre;
    TextView lblApellido;
    TextView lblEdad;

    RadioGroup rdGrpIdioma;

    RadioButton rdBtnEs;
    RadioButton rdBtnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Vinculamos todas las variables con su respectivo objeto en interfaz*/

        txtIdioma = findViewById(R.id.txtIdioma);

        lblNombre = findViewById(R.id.lblNombre);
        txtNombre = findViewById(R.id.txtNombre);

        lblApellido = findViewById(R.id.lblApellido);
        txtApellido = findViewById(R.id.txtApellido);

        lblEdad = findViewById(R.id.lblEdad);
        txtEdad = findViewById(R.id.txtEdad);

        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        rdBtnEs = findViewById(R.id.rdBtnEs);

        rdGrpIdioma.setOnCheckedChangeListener(this);

    }

    /*
    * En este método vamos a identificar que botón es el que se seleccionó para de esta forma
    *  Cambiar el texto de los componentes con las variables que creamos en Strings.xml*/

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rdBtnEs) {
            txtIdioma.setText(R.string.idioma);

            rdBtnEs.setText(R.string.espanol);
            rdBtnEn.setText(R.string.ingles_es);

            lblNombre.setText(R.string.nombre);
            txtNombre.setHint(R.string.txt_nombre);

            lblApellido.setText(R.string.apellido);
            txtApellido.setHint(R.string.txt_apellido);

            lblEdad.setText(R.string.edad);
            txtEdad.setHint(R.string.txt_edad);

        } else {
            txtIdioma.setText(R.string.idioma_en);

            rdBtnEs.setText(R.string.espanol_en);
            rdBtnEn.setText(R.string.ingles);

            lblNombre.setText(R.string.nombre_en);
            txtNombre.setHint(R.string.txt_nombre_en);

            lblApellido.setText(R.string.apellido_en);
            txtApellido.setHint(R.string.txt_apellido_en);

            lblEdad.setText(R.string.edad_en);
            txtEdad.setHint(R.string.txt_edad_en);

        }
    }
}
