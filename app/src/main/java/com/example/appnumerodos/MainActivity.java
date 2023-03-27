package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToLisaaKayttaja(View view) {
        Intent intent = new Intent(this,KysyTiedotActivity.class);
        startActivity(intent);
    }

    public void switchToListaaKayttaja(View view) {
        Intent intent = new Intent(this, ListaaTiedotActivity.class);
        startActivity(intent);
    }
}