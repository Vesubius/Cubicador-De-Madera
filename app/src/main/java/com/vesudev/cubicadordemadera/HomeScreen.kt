package com.vesudev.cubicadordemadera

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)

        // Ocultar la ActionBar
        supportActionBar?.hide()


        //======================= LOGICA DE NAVEGACION ENTRE PANTALLAS ==================================

        //Variable que controla el Boton Cubicar Madera Tucas
        var btnCubicarTucas = findViewById<AppCompatButton>(R.id.btnCubiTucas)

        //Evento click del boton Cubicar Madera Cuadrada
        btnCubicarTucas.setOnClickListener {
            val intent = Intent(this, ScreenCubicarTucas::class.java)
            startActivity(intent)
        }


        //Variable que controla el Boton Cubicar Madera Cuadrada
        var btnCubicarCuadrada = findViewById<AppCompatButton>(R.id.btnCubiCuadrada)

        //Evento click del boton Cubicar Madera Cuadrada
        btnCubicarCuadrada.setOnClickListener {
            val intent = Intent(this, ScreenCubicarCuadrada::class.java)
            startActivity(intent)
        }

        //======================= LOGICA DE NAVEGACION ENTRE PANTALLAS ==================================
    }
}