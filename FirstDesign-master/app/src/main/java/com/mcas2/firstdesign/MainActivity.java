package com.mcas2.firstdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Acceso2(View view) {
        Intent nIntent = new Intent(MainActivity.this, Login.class);
        startActivity(nIntent);
    }

    public void Registro2(View view) {
        Intent nIntent = new Intent(MainActivity.this, registro.class);
        startActivity(nIntent);
    }

}