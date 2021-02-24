package com.example.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Matematika_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematika_1);
    }

    public void lembarm1(View view) {
        Intent intent = new Intent(Matematika_1.this,Matematika_2.class);
        startActivity(intent);

    }

    public void lembarm1back(View view) {
        startActivity(new Intent(Matematika_1.this,MainActivity.class));
        finish();
    }
}