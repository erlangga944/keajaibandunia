package com.unpam.keajaibandunia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.Holder> {
    private ArrayList<keajaiban> flags;
    private Context context;

    public adapter(ArrayList<keajaiban> flags, Context context) {
        this.flags = flags;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.keajaiban,parent,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.Holder holder, int position) {
        keajaiban flag = flags.get(position);
        holder.judul.setText(flag.getJudul());
        holder.ibukota.setText(flag.getIbukota());
        holder.img.setImageResource(flag.getImg());



    }

    @Override
    public int getItemCount() {
        return flags.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView judul,ibukota;
        public ImageView img;

        public Holder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            ibukota = itemView.findViewById(R.id.ibukota);
            img = itemView.findViewById(R.id.imgflag);

        }
    }
}
