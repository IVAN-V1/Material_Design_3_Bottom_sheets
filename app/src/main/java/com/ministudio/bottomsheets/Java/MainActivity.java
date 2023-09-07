package com.ministudio.bottomsheets.Java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.ministudio.bottomsheets.Kotlin.Activity_Buttom_Sheet_kotlin;
import com.ministudio.bottomsheets.R;

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


        MaterialButton buttom_sheet_kotlin=findViewById(R.id.button3);
        buttom_sheet_kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, Activity_Buttom_Sheet_kotlin.class);
                startActivity(intent);



            }
        });



    }

    public void showModalBottomSheet() {
        ModalBottomSheet_Java modalBottomSheet = new ModalBottomSheet_Java();
        modalBottomSheet.show(getSupportFragmentManager(), ModalBottomSheet_Java.TAG);
    }





}