package com.example.eva1_6_idioma;

/*
Oscar Alejandro Rosique Vera
17550484
ISC
APP1
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    //Definimos variables de tipo TexView, RadioGroup,RadioButton y EdditText para linkearlos con los componentes en nuestra activity
    TextView txtIdioma;
    TextView txtNombre;
    TextView txtApellido;
    TextView txtEdad;

    RadioGroup rdGrpIdioma;

    RadioButton rdBtnEs;
    RadioButton rdBtnEn;

    EditText edtTxtNombre;
    EditText edtTxtApellido;
    EditText edtTxtEdad;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Linkeamos las variables globales con su respectivo componente para poder usarlos mediante el método findViewById
        Recibe como parametro R que es de donde proceden todos los componentes, es decir sus ID se alojan ahí
        */
        txtIdioma = findViewById(R.id.txtIdioma);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);

        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        rdBtnEs = findViewById(R.id.rdBtnEs);

        edtTxtNombre = findViewById(R.id.edtTxtNombre);
        edtTxtApellido = findViewById(R.id.edtTxtApellido);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);

        rdGrpIdioma.setOnCheckedChangeListener(this);

    }
    //Método que es exclusivo de los radioGroup el cual detecta un cambio  de selección de algún RadioButton pertenecientes a él.
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //Hacemos una comparación entre el RButton seleccionado y otro mediante su id
        if(checkedId == R.id.rdBtnEs){
            txtIdioma.setText(R.string.idioma_es);
            rdBtnEs.setText(R.string.espanol);
            rdBtnEn.setText(R.string.ingles_es);
        }else{
            txtIdioma.setText(R.string.idioma_en);
            rdBtnEs.setText(R.string.idioma_en);
            rdBtnEn.setText(R.string.espanol_en);
        }
    }
}
