package com.example.eva2_8_activity_result;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1 */
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Restaurant;
    Button btnContacto;
    Button btnImg;
    Button btnSound;
    Button btnMedia;
                                                                                                    //Generamos cada intento para cada acción a realizar
    Intent inSelRest;
    Intent inSelMedia;
    Intent inContact;
    Intent inImg;
    Intent inSound;
                                                                                                    //Generamos unos valores para poder asignarlos a los intentos, ya que requerimos un id y vamos a simularlo con esos valoes
    final int Imagenes = 3000;
    final int video = 4000;
    final int Restaurante = 1000;
    final int Contacto = 2000;
    final int audio = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Restaurant = findViewById(R.id.btnSeleccionar);
        btnContacto = findViewById(R.id.btnContacto);
        btnImg = findViewById(R.id.btnImagen);
        btnSound = findViewById(R.id.btnVideo);
                                                                                                    //Preparamos cada intento con su debida acción (ACTION_PICK para la mayoría porque vamos a cojer un objeto de cada acción)
        inImg= new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        inSound = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        inContact = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        inSelMedia = new Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        inSelRest = new Intent(this,MyDataActivity.class);
                                                                                                    //Asignamos el Intent para lanzar la aplicación que ejecutará la instrucción
        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inImg,Imagenes);
            }
        });

        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inSound,audio);
            }
        });

        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inContact,Contacto);
            }
        });
        btnMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelMedia,video);
            }
        });
    }
    public void onClick(View v){
        startActivity(inSelRest);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){                                                                       //Con este Case vamos a determinar que actividad nos va a devolver cada opción
            case Restaurante:
                if (resultCode == Activity.RESULT_OK){                                              //Cojemos la respuesta de la actividad
                    assert data!=null;                                                              //Ejecutamos un mensaje con cada uno de las opciones
                    Toast.makeText(this,data.getStringExtra("Restaurante seleccionado: "),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Cancelado por el usuario", Toast.LENGTH_SHORT).show();    //Esta opción recupera el "Result_Canceled" del botón cancelado de la actividad desplegada
                }
                break;
            case Contacto:
                if(resultCode == Activity.RESULT_OK){
                    String contacto = data.getDataString();
                    Log.wtf("Contacto",contacto);
                    Toast.makeText(this,contacto,Toast.LENGTH_SHORT).show();
                }
                break;
            case Imagenes:
                if(resultCode == Activity.RESULT_OK){
                    String imagen = data.getDataString();
                    Log.wtf("Imagen: ",imagen);
                    Toast.makeText(this,imagen,Toast.LENGTH_SHORT).show();
                }
                break;
            case video:
                if(resultCode == Activity.RESULT_OK){
                    String video = data.getDataString();
                    Log.wtf("Video: ",video);
                    Toast.makeText(this,video,Toast.LENGTH_SHORT).show();
                }
                break;
            case audio:
                if(resultCode == Activity.RESULT_OK){
                    String audio = data.getDataString();
                    Log.wtf("Audio: ",audio);
                    Toast.makeText(this,audio,Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
