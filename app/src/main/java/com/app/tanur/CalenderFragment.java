package com.app.tanur;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalenderFragment extends Fragment {

    private CalendarView time;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calender, container, false);


        time = view.findViewById(R.id.calender);
        time.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                Toast.makeText(getContext(), year + " | " + month+" | "+dayOfMonth, Toast.LENGTH_LONG).show();

                Log.e("MainActivity", "onSelectedDayChange: " + year + " | " + month+" | "+dayOfMonth);
            }
        });

        return view;


    }
}