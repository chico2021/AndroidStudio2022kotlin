package com.example.apparitmetico

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Resultado.setOnClickListener(){

            val num1 = edt_num1.text.toString().toDouble()
            val num2 = edt_num2.text.toString().toDouble()

            val resultado = String.format("%.2f",num1+num2)

            tv_Resultado.text = resultado
        }
    }
}