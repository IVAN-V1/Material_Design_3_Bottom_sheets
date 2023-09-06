package com.ministudio.bottomsheets;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static com.afollestad.materialdialogs.color.DialogColorChooserExtKt.colorChooser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

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

                clase clase= new clase();

            }
        });



    }

    public void showModalBottomSheet() {
        ModalBottomSheet_Java modalBottomSheet = new ModalBottomSheet_Java();
        modalBottomSheet.show(getSupportFragmentManager(), ModalBottomSheet_Java.TAG);
    }





}