package com.example.mapweek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddWeek extends AppCompatActivity {
    private EditText editTextSub;
    private EditText editTextRoom;
    private EditText editTextCorpus;
    private EditText editTextTeacher;
    private EditText editTextTimeBeginning;
    private EditText editTextTimeEnd;
    private EditText dayOfWeek;
    private Button buttonAdd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_week);
        editTextSub = findViewById(R.id.editTextSub);
        editTextRoom = findViewById(R.id.editTextRoom);
        editTextCorpus = findViewById(R.id.editTextCorpus);
        editTextTeacher = findViewById(R.id.editTextTeacher);
        editTextTimeBeginning = findViewById(R.id.editTextTimeBegining);
        editTextTimeEnd = findViewById(R.id.editTextTimeEnd);
        dayOfWeek = findViewById(R.id.dayOfWeek);
        buttonAdd = findViewById(R.id.buttonAdd);
    }

    public void addInApplication(View view) {
        if (dayOfWeek.getText().toString().equals("понедельник")
                || dayOfWeek.getText().toString().equals("вторник")
                || dayOfWeek.getText().toString().equals("среда")
                || dayOfWeek.getText().toString().equals("четверг")
                || dayOfWeek.getText().toString().equals("пятница")
                || dayOfWeek.getText().toString().equals("суббота") ||
                dayOfWeek.getText().toString().equals("воскресенье")) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("subject", editTextSub.getText());
            intent.putExtra("class", editTextRoom.getText());
            intent.putExtra("corpus", editTextCorpus.getText());
            intent.putExtra("teacher", editTextTeacher.getText());
            intent.putExtra("timeBeginning", editTextTimeBeginning.getText());
            intent.putExtra("timeEnd", editTextTimeEnd.getText());
            intent.putExtra("dayOfWeek", dayOfWeek.getText());
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),"Проверьте правильность написания дня недели", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}