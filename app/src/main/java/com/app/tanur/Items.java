package com.app.tanur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Items extends AppCompatActivity {

    RecyclerView recyclerView;

    String title[], price[], date[];

    int images[] = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5,
            R.drawable.car6,R.drawable.car7,R.drawable.car8,R.drawable.car9,R.drawable.car10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        recyclerView = findViewById(R.id.recyclerView);

        title = getResources().getStringArray(R.array.title);
        price = getResources().getStringArray(R.array.price);
        date = getResources().getStringArray(R.array.date);



        Adapter adapter = new Adapter(this, title, price, date, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}