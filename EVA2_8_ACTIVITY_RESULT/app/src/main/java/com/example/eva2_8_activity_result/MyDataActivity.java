package com.example.eva2_8_activity_result;
/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1 */
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MyDataActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    String[] nombres={                                                                              //Creamos la lista de los restaurantes
            "El Leñador",
            "El papalote",
            "El ojaldre",
            "Mercado Reforma",
            "Mesón catedral",
            "El rodeo",
            "Come Camila",
            "Mochos",
            "Los cinco panes",
            "La mansión",
            "Enrizos",
            "Foodie Friends",
            "II Fornaio",
            "El Quintal",
            "Dionisio",
            "Las Faenas",
            "Mayólica",
            "Los Mezquites"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        listView = findViewById(R.id.list);
                                                                                                    //Generamos el adaptador para pasar el arreglo a la lista de la interfaz
        listView.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres)
        );
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent devolverDatos = new Intent();                                                //Generamos el intento a utilizar para devolver los datos
                devolverDatos.putExtra("Restaurante Seleccionado", nombres[position]);        //Le agregamos al Intento el nombre del restaurante seleccionado para que sea visible en el MainActivity
                setResult(Activity.RESULT_OK, devolverDatos);
                finish();                                                                           //Finalizamos esta activity
            }
        });

        button = findViewById(R.id.btnCancelar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_CANCELED);                                                //En el caso de cancelarlo vamos a devolver ese resultado a la MainActivity
                finish();
            }
        });
    }
}
