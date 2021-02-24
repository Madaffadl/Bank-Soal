package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fisika_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisika_1);
    }

    public void lembarf1(View view) {
        Intent intent = new Intent(Fisika_1.this,Fisika_2.class);
        startActivity(intent);
    }

    public void lembarf1back(View view) {
        startActivity(new Intent(Fisika_1.this,MainActivity.class));
        finish();
    }
}