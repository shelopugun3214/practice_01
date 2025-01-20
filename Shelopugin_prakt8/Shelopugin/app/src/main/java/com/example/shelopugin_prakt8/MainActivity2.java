package com.example.shelopugin_prakt8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calculateCircleProperties(View v) {

        EditText inputField = findViewById(R.id.inputField);
        String input = inputField.getText().toString();
        TextView resultField = findViewById(R.id.resultField);
        double L = Double.parseDouble(input);
        double pi = 3.14;
        double R = L / (2 * pi);
        double S = pi * R * R;
        resultField.setText("R=" + R + "\nS=" + S);



    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
