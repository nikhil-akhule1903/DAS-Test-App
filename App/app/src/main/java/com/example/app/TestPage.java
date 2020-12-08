package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TestPage extends AppCompatActivity {

    TextView question;
    Button next;
    RadioGroup grp;
    int zero,one,two,three;
    RadioButton selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testpage);
        RadioButton rb = findViewById(R.id.zero);
        TextView question = findViewById(R.id.question);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setText("This works");
            }
        });
    }
}