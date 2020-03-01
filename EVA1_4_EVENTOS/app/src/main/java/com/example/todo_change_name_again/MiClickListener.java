package com.example.todo_change_name_again;

import android.content.Context;
import android.view.View;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.Toast;

public class MiClickListener implements View.OnClickListener {

    Context context;

    public MiClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "Por Clase Baby", Toast.LENGTH_LONG).show();
    }
}
