package com.example.appmensagem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_mensagem.setOnClickListener{

            val mensagem = edt_nome.text.toString()
            edt_nome.setText("")
            val resultado = mensagem.toString()

            tv_resultado.text = resultado
        }

    }
}