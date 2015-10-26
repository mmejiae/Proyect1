package com.example.marcela.proyecto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

@Bind(R.id.toolbar)Toolbar toolbar;
    Button nuevo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar.setTitle("Formato de registro");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

       nuevo=(Button)findViewById(R.id.nuevo);
    nuevo.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void nuevo(View view){
        Intent starter= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(starter);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==nuevo.getId()) {
            nuevo(v);
        }

    }
}