package com.example.eva1_11_weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lstVwClima;
    TextView txtCity;
    ImageView imgVwWeather;
    TextView txtTemp;
    TextView txtDesc;
    Weather[] cities = {
            new Weather("Chihuahua",20,"Nublado",R.drawable.light_rain),
            new Weather("Cuchillo parado",34,"Soleado",R.drawable.sunny),
            new Weather("Delicias",-2,"Nevado",R.drawable.snow),
            new Weather("Jimenez",24,"Lluvias intensas",R.drawable.rainy),
            new Weather("Camargo",30,"Nublado",R.drawable.rainy),
            new Weather("Parral",20,"lluvais aisladas",R.drawable.light_rain),
            new Weather("Aldama",-2,"nevando",R.drawable.snow),
            new Weather("Creel",10,"Tormenta electrica",R.drawable.thunderstorm),
            new Weather("Batopilas",11,"Nublado",R.drawable.cloudy),
            new Weather("Casas Grandes",23,"Nublado",R.drawable.cloudy)

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima=findViewById(R.id.listVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout,cities));
    }
}
