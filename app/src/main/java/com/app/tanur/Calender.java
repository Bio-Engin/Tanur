package com.app.tanur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class Calender extends AppCompatActivity {
    Button btn_back;
    private CalendarView time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calender.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        time = findViewById(R.id.calender);
        time.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(Calender.this, year + " | " + month+" | "+dayOfMonth, Toast.LENGTH_LONG).show();

                Log.e("MainActivity", "onSelectedDayChange: " + year + " | " + month+" | "+dayOfMonth);
            }
        });


    }
}