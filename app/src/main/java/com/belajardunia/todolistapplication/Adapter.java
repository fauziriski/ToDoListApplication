package com.belajardunia.todolistapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder> {

    private ArrayList<Profil> listmenuprofil;

    public Adapter(ArrayList<Profil> list) {
        this.listmenuprofil = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profil, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        Profil listmenu = listmenuprofil.get(position);
        holder.tvMenuProfil.setText(listmenu.getMenuprofil());
    }

    @Override
    public int getItemCount() {
        return listmenuprofil.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvMenuProfil;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMenuProfil = itemView.findViewById(R.id.tv_menuprofil);
            itemView.setOnClickListener(this);

        }

        public void onClick(View view){

        }
    }


}
