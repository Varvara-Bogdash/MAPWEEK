package com.example.mapweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddWeek extends AppCompatActivity {
private EditText editTextSub;
private EditText editTextRoom;
private EditText editTextCorpus;
private EditText editTextTeacher;
private EditText editTextTimeBeginning;
private EditText editTextTimeEnd;
private Spinner dayOfWeek;
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
    }

    public void addInApplication(View view) {
        int time = Integer.parseInt(editTextTimeBeginning.getText().toString());
 //       if () {
  //          textName.setHint("Нужно ввести имя");
   //    } else {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("subject", editTextRoom.getText());
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("subject", editTextSub.getText());
        intent.putExtra("dayOfWeek", dayOfWeek.getSelectedItem().toString());
        startActivity(intent);
//        }
    }
}