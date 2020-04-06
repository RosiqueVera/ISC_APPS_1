package com.example.eva2_10_toastview1;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtXCoordinate;
    EditText txtYCoordinate;
    TextView txtCaption;

    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCaption = findViewById(R.id.txtCaption);
        txtXCoordinate = findViewById(R.id.txtXCoordinate);
        txtYCoordinate = findViewById(R.id.txtYCoordinate);
        btnShowToast = findViewById(R.id.btnShowToast);

        int dpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = Resources.getSystem().getDisplayMetrics().heightPixels;

        txtCaption.append("\n screen size= " + width + "X" + height
                + " Density= " + dpi + "dpi");

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast myToast = Toast.makeText(getApplicationContext(), "here", Toast.LENGTH_SHORT);
                    myToast.setGravity(
                            Gravity.CENTER,
                            Integer.valueOf(txtXCoordinate.getText().toString()),
                            Integer.valueOf(txtYCoordinate.getText().toString()));
                    myToast.show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
