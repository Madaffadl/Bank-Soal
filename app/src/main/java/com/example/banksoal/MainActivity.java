package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void matematika(View view) {
        Intent intent = new Intent(MainActivity.this,Matematika_1.class);
        startActivity(intent);
    }

    public void fisika(View view) {
        Intent intent = new Intent(MainActivity.this,Fisika_1.class);
        startActivity(intent);
    }

    public void kimia(View view) {
        Intent intent = new Intent(MainActivity.this,Kimia_1.class);
        startActivity(intent);
    }
}