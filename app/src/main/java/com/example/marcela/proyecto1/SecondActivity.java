package com.example.marcela.proyecto1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    Button guardar;
    int Edad;
    String Nombre;
    long Celular;
    long Telefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        guardar = (Button) findViewById(R.id.btn_guardar);
        guardar.setOnClickListener(this);

    }


    public void guardar(View view){
        Intent starter= new Intent(SecondActivity.this,Vista2Activity.class);
        startActivity(starter);
    }


    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==guardar.getId()) {
            guardar(v);
        }
    }
}
