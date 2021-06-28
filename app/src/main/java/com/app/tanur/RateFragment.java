package com.app.tanur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;


public class RateFragment extends Fragment {

    private RatingBar ratingBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rate, container, false);


        ratingBar = view.findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getContext(), "Thank you for rating us", Toast.LENGTH_LONG).show();
                Toast.makeText(getContext(), "You gave us a " + rating, Toast.LENGTH_LONG).show();
                Log.e("rating", "onRatingChanged: " + rating );
            }
        });




        return view;
    }
}