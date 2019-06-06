package com.example.rudchenko_laba_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.holder> {

    Context ctx;

    public RvAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =  LayoutInflater.from(ctx).inflate(R.layout.holder_layout, viewGroup, false);
        holder hold = new holder(view);
        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int i) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }

    public class holder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);
        }

        public void bind() {
            textView.setText(MainActivity.digit(getAdapterPosition()));
        }
    }
}

