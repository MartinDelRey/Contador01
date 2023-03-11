package com.example.contador01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var cont:Int = 0
    var flagsita = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont = 0
        flagsita = true
        val txtValor = findViewById<TextView>(R.id.twvalor)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val btnContador = findViewById<Button>(R.id.btnContador)

        btnContador.setOnClickListener{
            if(cont == 0)
                flagsita = true
            else if(cont == 10)
                flagsita = false
            if(flagsita == true)
                cont = cont.inc()
            else if(flagsita == false)
                cont = cont.dec()

            txtValor.text = "$cont"

            btnBorrar.setOnClickListener{
                cont = 0
                flagsita = true
                txtValor.text = "$cont"
            }
        }


    }
}
