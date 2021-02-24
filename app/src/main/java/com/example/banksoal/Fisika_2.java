package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fisika_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisika_2);
    }

    public void lembarf2back(View view) {
        startActivity(new Intent(Fisika_2.this,Fisika_1.class));
        finish();
    }
}