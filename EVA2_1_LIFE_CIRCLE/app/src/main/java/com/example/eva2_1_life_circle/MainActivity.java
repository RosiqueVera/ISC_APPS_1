package com.example.eva2_1_life_circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mensaje("Create");
    }

    public void Mensaje(String mns){
        Toast.makeText(this,mns,Toast.LENGTH_SHORT).show();
        Log.wtf("APP",mns);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Mensaje("Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Mensaje("Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Mensaje("Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Mensaje("Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Mensaje("Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Mensaje("Destroy");
    }
}
