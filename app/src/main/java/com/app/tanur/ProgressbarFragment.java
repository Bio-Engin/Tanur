package com.app.tanur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ProgressbarFragment extends Fragment {

    private Button btn_mines;
    private Button btn_plus;
    private TextView text;
    private android.widget.ProgressBar progressBar;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progressbar, container, false);


        btn_mines = view.findViewById(R.id.btn_mines);
        btn_plus = view.findViewById(R.id.btn_plus);
        text = view.findViewById(R.id.text);
        progressBar = view.findViewById(R.id.progressBar);
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






        return view;
    }
}