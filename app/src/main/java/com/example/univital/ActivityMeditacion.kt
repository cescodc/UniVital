package com.example.univital

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityMeditacion : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var isPaused: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditacion)

        // Obtén la referencia al TextView en Kotlin
        val textViewFecha: TextView = findViewById(R.id.textViewFecha)

        // Utiliza la clase FechaUtil para obtener la fecha actual
        val fechaActual = FechaUtil.obtenerFechaActual()

        // Actualiza el texto del TextView con la fecha actual
        textViewFecha.text = "📅 $fechaActual"

        // Obtén la referencia al Spinner en Kotlin
        val spinnerEmociones: Spinner = findViewById(R.id.spinnerEmociones)

        // Utiliza la clase EmocionesUtil para configurar el Spinner
        EmocionesUtil.configurarSpinner(this, spinnerEmociones)

        // Obtén la referencia al botón de reproducción en Kotlin
        val playButton: Button = findViewById(R.id.playButton)

        // Obtén la referencia al botón de detención en Kotlin
        val stopButton: Button = findViewById(R.id.stopButton)

        // Inicializa el MediaPlayer
        mediaPlayer = MediaPlayer()

        // Configura el listener del botón de reproducción utilizando la clase ButtonClickListener
        playButton.setOnClickListener(ButtonClickListener(this, mediaPlayer!!))

        // Configura el listener del botón de detención
        stopButton.setOnClickListener {
            pauseOrStopSound()
        }
    }

    private fun pauseOrStopSound() {
        // Pausa la reproducción si está en curso, o detén si ya está pausado
        mediaPlayer?.apply {
            if (isPlaying) {
                pause()
                isPaused = true
            } else if (isPaused) {
                // Si ya está pausado, reanuda la reproducción
                start()
                isPaused = false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Asegúrate de liberar los recursos del MediaPlayer cuando se destruye la actividad
        mediaPlayer?.release()
    }
}
