package com.ministudio.bottomsheets.Kotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.ministudio.bottomsheets.Java.ModalBottomSheet_Java
import com.ministudio.bottomsheets.R

class Activity_Buttom_Sheet_kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttom_sheet_kotlin)



        val boton = findViewById<MaterialButton>(R.id.button2)
        boton.setOnClickListener(View.OnClickListener {


            showModalBottomSheet()

        })


    }

    fun showModalBottomSheet() {
        val modalBottomSheet = ModalBottomSheet_Java()
        modalBottomSheet.show(supportFragmentManager, ModalBottomSheet_Java.TAG)
    }

}