package com.vesudev.cubicadordemadera

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class ScreenCubicarTucas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cubicar_tucas)

        // Ocultar la ActionBar
        supportActionBar?.hide()


        //Variable que controla el TextView de Resultado
        var tvResultado = findViewById<AppCompatTextView>(R.id.tvResultado)

        //Variable que controla el EditText Largo
        var etLargo = findViewById<AppCompatEditText>(R.id.etLargo)

        //variable que controla el EditText Diametro
        var etDiametro = findViewById<AppCompatEditText>(R.id.etAncho)

        //Variable que controla el Boton Cubicar
        var btnCubicar = findViewById<AppCompatButton>(R.id.btnCubicar)

        //Evento click del boton Cubicar
        btnCubicar.setOnClickListener {

            // Formula Diametro * Diametro / 4 * Largo
            var resultado = etDiametro.text.toString().toDouble() * etDiametro.text.toString().toDouble() / 4 * etLargo.text.toString().toDouble()

            //Muestra el resultado en el TextView Resultado
            tvResultado.setText(resultado.toString())
        }

    }
}