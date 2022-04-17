package com.example.appfuncao_sem_retorno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btn_mensagem.setOnClickListener(){
                mensagem()
            }
    }

    fun mensagem(){

        val msg = edt_mensagem.text.toString()
        tv_Resultado.text = msg

    }
}