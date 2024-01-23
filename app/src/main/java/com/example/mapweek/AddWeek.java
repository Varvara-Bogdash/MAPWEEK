package com.example.mapweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddWeek extends AppCompatActivity {
private EditText editTextSub;
private EditText editTextRoom;
private EditText editTextCorpus;
private EditText editTextTeacher;
private EditText editTextTimeBeginning;
private EditText editTextTimeEnd;
private Spinner dayOfWeek;
private Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_week);
        editTextSub = findViewById(R.id.editTextSub);
        editTextRoom = findViewById(R.id.editTextRoom);
        editTextCorpus = findViewById(R.id.editTextCorpus);
        editTextTeacher = findViewById(R.id.editTextTeacher);
        editTextTimeBeginning = findViewById(R.id.editTextTimeBeginning);
        editTextTimeEnd = findViewById(R.id.editTextTimeEnd);
        dayOfWeek = findViewById(R.id.spinner);
        buttonAdd = findViewById(R.id.buttonAdd);
    }

    public void addInApplication(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("class", editTextRoom.getText());
        intent.putExtra("corpus", editTextCorpus.getText());
        intent.putExtra("teacher", editTextTeacher.getText());
        intent.putExtra("timeBeginning", editTextTimeBeginning.getText());
        intent.putExtra("timeEnd", editTextTimeEnd.getText());
        intent.putExtra("dayOfWeek", dayOfWeek.getSelectedItem().toString());
        startActivity(intent);
    }
}