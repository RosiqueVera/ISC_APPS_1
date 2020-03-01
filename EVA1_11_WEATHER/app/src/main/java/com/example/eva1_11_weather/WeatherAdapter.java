package com.example.eva1_11_weather;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {
   private Weather[] objects;
   private Context context;
   private int resource;
    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects=objects;
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //ConvertView representa mi layout creado
        if (convertView ==null){ //Primera vez que se ejecuta el layout
            convertView = ((Activity) context).getLayoutInflater().inflate(resource, parent,false);
        }
        //Hay que recuperar los componentes

        TextView txtCity,txtTemp, txtDesc;
        ImageView imgVwWeather;

        imgVwWeather = convertView.findViewById(R.id.imgWvWeather);
        txtCity = convertView.findViewById(R.id.txt_City);
        txtDesc = convertView.findViewById(R.id.txtDesc);
        txtTemp = convertView.findViewById(R.id.txtTemp);

        imgVwWeather.setImageResource(objects[position].getImage());
        txtCity.setText(objects[position].getCity());
        txtDesc.setText(objects[position].getDesc());
        txtTemp.setText(""+objects[position].getTemp());
        return convertView;
    }
}
