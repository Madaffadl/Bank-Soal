package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kimia_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimia_1);
    }

    public void lembark1(View view) {
        Intent intent = new Intent(Kimia_1.this,Kimia2.class);
        startActivity(intent);
    }

    public void lembark1back(View view) {
        startActivity(new Intent(Kimia_1.this,MainActivity.class));
        finish();
    }
}