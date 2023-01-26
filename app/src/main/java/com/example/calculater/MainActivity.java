package com.example.calculater;

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

    public void openCalculator(View view) {
        Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivity(calculatorIntent);
    }

    public void openScoreCounter(View view) {
        Intent scoreCounterIntent = new Intent(MainActivity.this, ScoreCounterActivity.class);
        startActivity(scoreCounterIntent);
    }
}