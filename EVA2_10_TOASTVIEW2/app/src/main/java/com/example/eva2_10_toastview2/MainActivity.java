package com.example.eva2_10_toastview2;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomToast(View view) {
        Toast customToast = makeCustomToast(this);
        customToast.show();
    }

    protected Toast makeCustomToast(Context context) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, null);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        text.setText("this is a custom Toast");

        Toast toast = new Toast(context);
        toast.setMargin(0, -50);
        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);
        return toast;

    }
}
