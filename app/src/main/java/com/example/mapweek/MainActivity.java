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
    int countOfDays = 7;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button settings = findViewById(R.id.nastroki);
        Button plus = findViewById(R.id.plus);
        textView = findViewById(R.id.textView2);

    }

    public void plus(View view) {
        Intent intent = new Intent(this, AddWeek.class);
        startActivity(intent);
        backIn();
    }

    private void backIn() {
        sub = Objects.requireNonNull(getIntent().getExtras()).getString("subject");
        room = Objects.requireNonNull(getIntent().getExtras()).getString("class");
        corpus = Objects.requireNonNull(getIntent().getExtras()).getString("corpus");
        teacher = Objects.requireNonNull(getIntent().getExtras()).getString("teacher");
        timeBeginning = Objects.requireNonNull(getIntent().getExtras()).getString("timeBeginning");
        timeEnd = Objects.requireNonNull(getIntent().getExtras()).getString("timeEnd");
        dayOfWeek = Objects.requireNonNull(getIntent().getExtras()).getString("dayOfWeek");
        switch (countOfDays){
            case 1:
                if (dayOfWeek.toString().equals("понедельник")){
                    mon(textView);
                } else {
                    break;
                }
            case 2:
                if (dayOfWeek.toString().equals("вторник")){
                    tue(textView);
                } else {
                    break;
                }
            case 3:
                if (dayOfWeek.toString().equals("среда")){
                    wed(textView);
                } else {
                    break;
                }
            case 4:
                if (dayOfWeek.toString().equals("четверг")){
                    thu(textView);
                } else {
                    break;
                }
            case 5:
                if (dayOfWeek.toString().equals("пятница")){
                    fri(textView);
                } else {
                    break;
                }
            case 6:
                if (dayOfWeek.toString().equals("суббота")){
                    sut(textView);
                } else {
                    break;
                }
            case 7:
                sun(textView);
                    break;
           }
    }

    @SuppressLint("SetTextI18n")
    public void mon(View view) {
textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void tue(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void wed(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void thu(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void fri(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void sut(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    @SuppressLint("SetTextI18n")
    public void sun(View view) {
        textView.setText("Предмет: " + sub + "\n" + "Учитель:" + teacher + "\n" + "Корпус:" + corpus + "\n" + "Кабинет:" + room + "\n" + "День недели:" + dayOfWeek);
    }

    public void settings(View view) {
    }
}