package com.example.app_imc_funcao_retorno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.CharSequence as KotlinCharSequence

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_calcular.setOnClickListener(){


           btn_resultado.text =
               calcularImc(edt_Peso.text.toString().toDouble(),edt_Altura.text.toString().toDouble()).toString()
        }
    }

    fun calcularImc(peso: Double = edt_Peso.text.toString().toDouble(), Altura: Double = edt_Altura.text.toString().toDouble()):String {

       return String.format("%.2f",peso/(Altura*Altura))

    }
}