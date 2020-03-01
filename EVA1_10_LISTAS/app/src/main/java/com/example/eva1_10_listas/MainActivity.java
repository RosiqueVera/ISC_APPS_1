package com.example.eva1_10_listas;
/*
* Oscar Alejandro Rosique Vera
* ISC
* APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView lstFabr;
    String[] Fabricantes = {                                                                        //Creamos una lista, la cual va  a mostrarse en nuestro elemento
            "Aorus",
            "Zotac",
            "Gygabite",
            "Asus",
            "MSI",
            "CoolerMaster",
            "Termaltake",
            "Cougar",
            "G-Skill",
            "SteelSeries",
            "Logitech",
            "GameFactor"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstFabr = findViewById(R.id.lstFarbricantes);
        lstFabr.setAdapter(
                new ArrayAdapter<String>(this,                                              //Creamos un Adaptador el cual nos va a servir para desplegar los elementos de nuestro Array en nuestra lista
                        android.R.layout.simple_list_item_1,
                        Fabricantes
                        ));

        lstFabr.setOnItemClickListener(this);
    }
                                                                                                    //Al Dar click en algún objeto de nuestra lista nos va  mostrar un mensaje con el texto del item seleccionado
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),Fabricantes[position], Toast.LENGTH_SHORT).show();
    }
}
