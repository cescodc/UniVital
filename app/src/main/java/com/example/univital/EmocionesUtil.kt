package com.example.univital

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Spinner

object EmocionesUtil {

    fun configurarSpinner(context: Context, spinner: Spinner) {
        // Define las emociones disponibles
        val emociones = arrayOf("Selecciona una emoción", "\uD83D\uDE0A Feliz ", "\uD83D\uDE22 Triste", "\uD83D\uDE20 Enojado", "\uD83D\uDE1F Preocupado", "\uD83D\uDE32 Sorprendido", "\uD83D\uDE42 Neutral")

        // Crea un adaptador para el Spinner
        val adapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, emociones)

        // Establece el diseño para los elementos desplegados
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Aplica el adaptador al Spinner
        spinner.adapter = adapter

        // Establece la emoción por defecto
        spinner.setSelection(0)
    }
}

