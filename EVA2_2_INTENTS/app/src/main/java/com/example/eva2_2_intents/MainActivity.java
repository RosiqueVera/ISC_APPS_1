package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtPhone;
    Intent inTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPhone=findViewById(R.id.txtPhone);

    }

    public void onClick(View v){

        String cade = "tel:"+txtPhone.getText().toString();

        if (v.getId() == R.id.btnDial){
            //<Acción,datos>
            //Intento implicito
            inTel = new Intent(Intent.ACTION_DIAL, Uri.parse(cade));

        }else{
            inTel = new Intent(Intent.ACTION_CALL, Uri.parse(cade));

        }

        startActivity(inTel);

    }

}
