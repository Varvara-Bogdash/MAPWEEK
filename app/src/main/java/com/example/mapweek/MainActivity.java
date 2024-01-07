package com.example.mapweek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String sub;
    String room;
    String corpus;
    String teacher;
    String timeBeginning;
    String timeEnd;
    String dayOfWeek;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button monday = findViewById(R.id.MON);
        Button tuesday = findViewById(R.id.TUE);
        Button wednesday = findViewById(R.id.WED);
        Button thursday = findViewById(R.id.THU);
        Button friday = findViewById(R.id.FRI);
        Button saturday = findViewById(R.id.SUT);
        Button sunday = findViewById(R.id.SUN);
        Button settings = findViewById(R.id.nastroki);
        Button plus = findViewById(R.id.plus);
        TextView textView = findViewById(R.id.textView2);

//        sub = Objects.requireNonNull(getIntent().getExtras()).getString("subject");
//        room = Objects.requireNonNull(getIntent().getExtras()).getString("class");
//        corpus = Objects.requireNonNull(getIntent().getExtras()).getString("corpus");
//        teacher = Objects.requireNonNull(getIntent().getExtras()).getString("teacher");
//        timeBeginning = Objects.requireNonNull(getIntent().getExtras()).getString("timeBeginning");
//        timeEnd = Objects.requireNonNull(getIntent().getExtras()).getString("timeEnd");
//        dayOfWeek = Objects.requireNonNull(getIntent().getExtras()).getString("dayOfWeek");
    }

    public void plus(View view) {
        Intent intent = new Intent(this, AddWeek.class);
        startActivity(intent);
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

    public void settings(View view) {
    }
}