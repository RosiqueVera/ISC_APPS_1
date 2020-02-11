package com.example.eva_1__5_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup Marcas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Marcas = findViewById(R.id.Marcas);
        Marcas.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton rbtn=findViewById(checkedId);
        Toast.makeText(this,rbtn.getText(),Toast.LENGTH_SHORT);
    }
}
