package com.example.mapweek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button monday;
    private Button tuesday;
    private Button wednesday;
    private Button thursday;
    private Button friday;
    private Button saturday;
    private Button sunday;
    private Button plus;
    private Button nastrouki;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monday = findViewById(R.id.MON);
        tuesday = findViewById(R.id.TUE);
        wednesday = findViewById(R.id.WED);
        thursday = findViewById(R.id.THU);
        friday = findViewById(R.id.FRI);
        saturday = findViewById(R.id.SUT);
        sunday = findViewById(R.id.SUN);
        nastrouki = findViewById(R.id.nastroki);
        plus = findViewById(R.id.plus);
    }

    public void mon(View view) {
    }

    public void tue(View view) {

    }

    public void wed(View view) {

    }

    public void thu(View view) {

    }

    public void fri(View view) {

    }

    public void sut(View view) {

    }

    public void sun(View view) {

    }

    public void nastrouki(View view) {

    }

    public void plus(View view) {

    }
}