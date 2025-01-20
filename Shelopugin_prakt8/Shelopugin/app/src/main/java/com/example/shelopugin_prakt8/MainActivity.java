package com.example.shelopugin_prakt8;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void calculatePerimeter(View v) {
        EditText inputField = findViewById(R.id.inputField);
        String input = inputField.getText().toString();





        double a = Double.parseDouble(input);
        double W = 4 * a;


        TextView resultField = findViewById(R.id.resultField);
        resultField.setText("W = " + W);


    }

}

