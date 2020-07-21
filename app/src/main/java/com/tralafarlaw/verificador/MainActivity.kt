package com.tralafarlaw.verificador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mDays = arrayOf(
        "Lunes",
        "Martes",
        "Miercoles",
        "Jueves",
        "Viernes"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            editTextNumber.text.also {ss ->
                if(ss.isNullOrBlank() || ss.isNullOrEmpty() ||
                    ss.toString()[ss.lastIndex] != '0'||
                    ss.toString()[ss.lastIndex] != '1'||
                    ss.toString()[ss.lastIndex] != '2'||
                    ss.toString()[ss.lastIndex] != '3'||
                    ss.toString()[ss.lastIndex] != '4'||
                    ss.toString()[ss.lastIndex] != '5'||
                    ss.toString()[ss.lastIndex] != '6'||
                    ss.toString()[ss.lastIndex] != '7'||
                    ss.toString()[ss.lastIndex] != '8'||
                    ss.toString()[ss.lastIndex] != '9'){
                    Toast.makeText(this, "Porfavor ingrese su CI sin extension")
                    return@setOnClickListener
                }
                if (ss.toString()[ss.lastIndex] == '2'||
                    ss.toString()[ss.lastIndex] == '1'){
                    textView.text = String.format("Puede salir el día %s", mDays[0])
                }
                if (ss.toString()[ss.lastIndex] == '4'||
                    ss.toString()[ss.lastIndex] == '3'){
                    textView.text = String.format("Puede salir el día %s", mDays[1])
                }
                if (ss.toString()[ss.lastIndex] == '6'||
                    ss.toString()[ss.lastIndex] == '5'){
                    textView.text = String.format("Puede salir el día %s", mDays[2])
                }
                if (ss.toString()[ss.lastIndex] == '8'||
                    ss.toString()[ss.lastIndex] == '7'){
                    textView.text = String.format("Puede salir el día %s", mDays[3])
                }
                if (ss.toString()[ss.lastIndex] == '9'||
                    ss.toString()[ss.lastIndex] == '0'){
                    textView.text = String.format("Puede salir el día %s", mDays[4])
                }
            }
        }
    }
}