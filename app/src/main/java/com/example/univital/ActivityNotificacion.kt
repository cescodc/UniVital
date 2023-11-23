package com.example.univital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityNotificacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificacion)
    }
}
/*
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buscar el CardView por su ID
        val cardView: CardView = findViewById(R.id.cardView)

        // Agregar un OnClickListener al CardView
        cardView.setOnClickListener {
            // Acción a realizar al hacer clic en el CardView (abrir una nueva pantalla)
            val intent = Intent(this, NuevaActividad::class.java)
            startActivity(intent)
        }
    }
}
 */