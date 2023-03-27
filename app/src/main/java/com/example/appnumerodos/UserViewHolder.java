package com.example.appnumerodos;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userimageView;
    TextView nimi, email, ala;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userimageView = itemView.findViewById(R.id.imageView);
        nimi = itemView.findViewById(R.id.txtNimi);
        email = itemView.findViewById(R.id.txtEmail);
        ala = itemView.findViewById(R.id.txtAla);
    }
}
