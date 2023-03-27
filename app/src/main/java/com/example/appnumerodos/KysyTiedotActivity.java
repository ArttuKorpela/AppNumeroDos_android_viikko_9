package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class KysyTiedotActivity extends AppCompatActivity {
    private EditText etunimi;
    private EditText sukunimi;
    private EditText email;

    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kysy_tiedot);

        etunimi = findViewById(R.id.editTextEtunimi);
        sukunimi = findViewById(R.id.editTextSukunimi);
        email = findViewById(R.id.editTextEmail);


    }

    public void addUser(View view) {

        RadioGroup rgAlat = findViewById(R.id.rgAlat);

        RadioGroup rgKuva = findViewById(R.id.rgKuvat);

        switch (rgKuva.getCheckedRadioButtonId()) {
            case R.id.rbKuva1:
                image = R.drawable.screenshot_2023_03_24_012609;
                break;
            case R.id.rbKuva2:
                image = R.drawable.screenshot_2023_03_24_012836;
                break;
        }

        switch (rgAlat.getCheckedRadioButtonId()) {
            case R.id.rbTite:
                UserStorage.getInstance().addUser(new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tietotekniikka",image));
                break;
            case R.id.rbTuta:
                UserStorage.getInstance().addUser(new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tietotekniikka",image));
                break;
            case R.id.rbSate:
                UserStorage.getInstance().addUser(new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tietotekniikka",image));
                break;
            case R.id.rbLate:
                UserStorage.getInstance().addUser(new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tietotekniikka",image));
                break;
        }

        /*for (User user : UserStorage.getInstance().getUsers()) {
            System.out.println(user.getFirsName());
        }*/
    }






}