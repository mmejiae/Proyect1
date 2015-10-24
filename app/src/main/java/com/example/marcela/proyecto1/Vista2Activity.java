package com.example.marcela.proyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Vista2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_eliminar;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
    }

    public void btn_eliminar(View v) {
        Toast toast = Toast.makeText(this, "Se eliminara el registro", Toast.LENGTH_LONG);
        toast.show();


    }
    public void btn_editar(View v) {
        Toast toast = Toast.makeText(this, "Vamos a editarlo", Toast.LENGTH_LONG);
        toast.show();


    }
    @Override
    public void onClick(View v) {

    }
}



