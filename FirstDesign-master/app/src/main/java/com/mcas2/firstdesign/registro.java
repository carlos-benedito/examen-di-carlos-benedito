package com.mcas2.firstdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
    }


    public void login_registro(View view) {
        Intent nIntent = new Intent(registro.this, Login.class);
        startActivity(nIntent);
    }

    public void inicio(View view) {
        Intent nIntent = new Intent(registro.this, MainActivity.class);
        startActivity(nIntent);
    }


}