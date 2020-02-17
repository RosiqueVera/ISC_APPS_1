package com.example.eva_1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    RadioGroup Languaje;
    RadioButton Languaje_Es,Languaje_En;
    TextView Name,Frist_Name,Age;
    EditText txt_Name,txt_Frist_Name,txt_Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Languaje=findViewById(R.id.Languaje);

        Languaje_Es=findViewById(R.id.Languaje_Es);
        Languaje_En=findViewById(R.id.Languaje_En);

        Name=findViewById(R.id.Name);
        Frist_Name=findViewById(R.id.Frist_Name);
        Age=findViewById(R.id.Age);

        txt_Age=finishFromChild(R.id.txt_Age);
        txt_Name=findViewById(R.id.txt_Name);
        txt_Frist_Name=findViewById(R.id.txt_Frist_Name);
    }


}
