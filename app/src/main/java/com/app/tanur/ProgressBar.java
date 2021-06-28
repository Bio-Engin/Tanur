package com.app.tanur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProgressBar extends AppCompatActivity {
    private Button btn_back;
    private Button btn_mines;
    private Button btn_plus;
    private TextView text;
    private android.widget.ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        btn_mines = findViewById(R.id.btn_mines);
        btn_plus = findViewById(R.id.btn_plus);
        btn_back = findViewById(R.id.btn_back);
        text = findViewById(R.id.text);
        progressBar = findViewById(R.id.progressBar);
        final int[] progress = {0};




        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress[0] <=90) {
                    progress[0] += 10;
                }
            }
        });

        btn_mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress[0] >=10) {
                    progress[0] -= 10;
                    progressBar.setProgress(progress[0]);
                }
            }
        });

        progressBar.setProgress(progress[0]);
        text.setText("" + progress[0] + "%");

    }
}