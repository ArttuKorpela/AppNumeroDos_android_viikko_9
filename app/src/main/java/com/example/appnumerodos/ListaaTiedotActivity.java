package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListaaTiedotActivity extends AppCompatActivity {

    private UserStorage storage;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaa_tiedot);
        storage = UserStorage.getInstance();
        recyclerView = findViewById(R.id.user_view_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserViewAdapter(getApplicationContext(), storage.getUsers()));
    }
}