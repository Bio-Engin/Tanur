package com.app.tanur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate extends AppCompatActivity {
    Button btn_back;
    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        btn_back = findViewById(R.id.btn_back);
        ratingBar = findViewById(R.id.ratingBar);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rate.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Rate.this, "Thank you for rating us", Toast.LENGTH_LONG).show();
                Toast.makeText(Rate.this, "You gave us a " + rating, Toast.LENGTH_LONG).show();
                Log.e("rating", "onRatingChanged: " + rating );
            }
        });
    }
}