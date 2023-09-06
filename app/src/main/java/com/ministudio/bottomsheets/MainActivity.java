package com.ministudio.bottomsheets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);


        MaterialButton button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                showModalBottomSheet();

            }
        });




    }

    public void showModalBottomSheet() {
        ModalBottomSheet_Java modalBottomSheet = new ModalBottomSheet_Java();
        modalBottomSheet.show(getSupportFragmentManager(), ModalBottomSheet_Java.TAG);
    }



}