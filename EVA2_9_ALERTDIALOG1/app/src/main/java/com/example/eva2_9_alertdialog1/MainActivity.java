package com.example.eva2_9_alertdialog1;
/*
 * Oscar Alejandro Rosique Vera
 * 17550484
 * ISC
 * APP1*/
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtMsg;
    Button btnCustomDialog;
    Button btnAlertDialog;
    Button btnDialogFragment;
    Context activityContext;
    String msg = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityContext = this;
        txtMsg = findViewById(R.id.txtMsg);

        btnAlertDialog = findViewById(R.id.btnAlertDialog1);
        btnCustomDialog = findViewById(R.id.btnCustomDialog);
        btnDialogFragment = findViewById(R.id.btnAlertDialog2);

        btnAlertDialog.setOnClickListener(this);
        btnCustomDialog.setOnClickListener(this);
        btnDialogFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnAlertDialog.getId()) {
            showMyAlertDialog(this);
        }
        if (v.getId() == btnCustomDialog.getId()) {
            showCustomDialogBox();
        }
        if (v.getId() == btnDialogFragment.getId()) {
            showMyAlertDialogFragment(this);
        }

    }

    public void doPositiveClick(Date time) {
        txtMsg.setText("positive - dialogFragment picked @ " + time);
    }

    public void doNegativeClick(Date time) {
        txtMsg.setText("negative - dialogFragment picked @ " + time);
    }

    public void doNeutralClick(Date time) {
        txtMsg.setText("neutral - dialogFragment picked @ " + time);
    }

    private void showCustomDialogBox() {
        final Dialog customDialog = new Dialog(activityContext);
        customDialog.setTitle("custom dialog title");

        customDialog.setContentView(R.layout.custom_dialog_layout);

        ((TextView) customDialog.findViewById(R.id.title))
                .setText("omg");

        final EditText sd_txtInputData = customDialog.findViewById(R.id.txtSomeData);

        ((Button) customDialog.findViewById(R.id.btnClose))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtMsg.setText(sd_txtInputData.getText().toString());
                        customDialog.dismiss();
                    }
                });
        customDialog.show();
    }

    private void showMyAlertDialogFragment(MainActivity mainActivity) {
        DialogFragment dialogFragment = MyAlertDialogFragment
                .newInstance(R.string.hello_world);
        dialogFragment.show(getSupportFragmentManager(), "TAG_MYDIALOGFRAGMENT1");
    }

    private void showMyAlertDialog(MainActivity mainActivity) {
        new AlertDialog.Builder(mainActivity)
                .setTitle("terminator")
                .setMessage("are you sure that you want to quit?")
                .setIcon(R.drawable.ic_launcher_background)


                .setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //actions
                                msg = "Yes" + which;
                                txtMsg.setText(msg);
                            }//onClick
                        }
                )
                .setNeutralButton("cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                msg = "cancel" + which;
                                txtMsg.setText(msg);
                            }
                        }
                )
                .setNegativeButton("no",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                msg = "no" + which;
                                txtMsg.setText(msg);
                            }
                        }
                )
                .create()
                .show();
    }
}
