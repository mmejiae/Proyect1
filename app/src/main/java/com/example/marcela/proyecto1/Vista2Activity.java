package com.example.marcela.proyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vista2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);

        btn_eliminar = (Button) findViewById(R.id.btn_eliminar);
        btn_eliminar.setOnClickListener(this);



    @Override
    public void onClick(View v) {

    }
}







