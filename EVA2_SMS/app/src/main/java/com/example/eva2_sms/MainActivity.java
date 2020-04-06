package com.example.eva2_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intentSms;
    Button btnMensaje;
    EditText mensaje, telefono;

    //TODO: Cambiar el nombre de las variables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMensaje = findViewById(R.id.btnMensaje);
        mensaje = findViewById(R.id.txtMensaje);
        telefono = findViewById(R.id.txtTelefono);

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sTel = "smsto:" + telefono.getText().toString();
                String sMensaje = mensaje.getText().toString();

                //intento implicito
                intentSms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
                intentSms.putExtra("sms_body", sMensaje);

                startActivity(intentSms);
            }
        });

    }
}
