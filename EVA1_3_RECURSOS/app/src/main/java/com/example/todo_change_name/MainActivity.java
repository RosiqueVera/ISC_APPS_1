package com.example.todo_change_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgTwitter;
    TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTwitter = findViewById(R.id.imgTwitter);
        txtTitle = findViewById(R.id.txtTitle);
        imgTwitter.setImageResource(R.drawable.twitter);
        txtTitle.setText("resources");


    }
}
