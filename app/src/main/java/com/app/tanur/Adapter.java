package com.app.tanur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    String data1[], data2[], data3[];
    int images[];
    Context context;

    Adapter(Context ct, String title[], String price[], String date[], int img[]) {

        context = ct;
        data1 = title;
        data2 = price;
        data3 = date;
        images = img;

    }



    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rows, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.title.setText(data1[position]);
        holder.date.setText(data3[position]);
        holder.price.setText(data2[position]);
        holder.img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, price, date;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_title);
            price = itemView.findViewById(R.id.txt_price);
            date = itemView.findViewById(R.id.txt_date);
            img = itemView.findViewById(R.id.img);
        }
    }
}
