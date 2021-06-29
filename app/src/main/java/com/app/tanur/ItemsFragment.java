package com.app.tanur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemsFragment extends Fragment {


    RecyclerView recyclerView;

    String title[], price[], date[];

    int images[] = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5,
            R.drawable.car6,R.drawable.car7,R.drawable.car8,R.drawable.car9,R.drawable.car10};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);

        title = getResources().getStringArray(R.array.title);
        price = getResources().getStringArray(R.array.price);
        date = getResources().getStringArray(R.array.date);



        Adapter adapter = new Adapter(getContext(), title, price, date, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}