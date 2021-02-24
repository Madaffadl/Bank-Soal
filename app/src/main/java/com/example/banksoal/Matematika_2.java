package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Matematika_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika_2);
    }

    public void lembarm2back(View view) {
        startActivity(new Intent(Matematika_2.this,Matematika_1.class));
        finish();
    }
}