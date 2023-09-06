package com.ministudio.bottomsheets

import android.content.Context
import android.graphics.Color.BLUE
import android.graphics.Color.GREEN
import android.graphics.Color.RED
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.color.colorChooser

class clase {



    val colors = intArrayOf(RED, GREEN, BLUE)

    fun Mostrar(context: Context) {
        MaterialDialog(context).show {
            title(R.string.colors)
            colorChooser(colors) { dialog, color ->
                // Use color integer
            }
            positiveButton(R.string.select)
        }
    }


}