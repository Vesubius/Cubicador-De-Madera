package com.vesudev.cubicadordemadera

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class ScreenCubicarCuadrada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen_cubicar_cuadrada)
        // Ocultar la ActionBar
        supportActionBar?.hide()
        //Variable que controla el texto de Resultado
        val tvResultado = findViewById<AppCompatTextView>(R.id.tvResultado)
        //Variable que contiene la informacion de el EditText Largo
        val etLargo = findViewById<AppCompatEditText>(R.id.etLargo)

        //Variable que contiene la informacion de el EditText Ancho
        val etAncho = findViewById<AppCompatEditText>(R.id.etAncho)

        //Variable que controla el Boton Cubicar
        val btnCubicar = findViewById<AppCompatButton>(R.id.btnCubicar)

        btnCubicar.setOnClickListener {
            //Evento click del boton Cubicar
            val resultado =  etAncho.text.toString().toDouble() / 4 * etLargo.text.toString().toDouble()

            //Muestra el resultado en el TextView Resultado
            tvResultado.setText(resultado.toString())

        }
    }
}