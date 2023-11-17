package com.example.univital

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.view.View

class ButtonClickListener(private val context: Context, private val mediaPlayer: MediaPlayer) : View.OnClickListener {

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.playButton -> playSound()
        }
    }

    private fun playSound() {
        // Libera los recursos del MediaPlayer si ya está en uso
        mediaPlayer.reset()

        // Crea un nuevo MediaPlayer y carga el sonido desde el recurso raw
        val soundResourceId = R.raw.meditacion_guiada

        try {
            mediaPlayer.setDataSource(context, android.net.Uri.parse("android.resource://" + context.packageName + "/" + soundResourceId))

            // Configura los atributos de audio para asegurarse de que el sonido se reproduce correctamente
            mediaPlayer.setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )

            mediaPlayer.prepare()
            mediaPlayer.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
