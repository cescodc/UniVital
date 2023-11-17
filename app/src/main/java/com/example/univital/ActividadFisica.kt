package com.example.univital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ActividadFisica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_fisica)

        // Buscar el CardView por su ID
        val cardSleep: CardView = findViewById(R.id.todosLosRegistros)

        // Agregar OnClickListener al CardView
        cardSleep.setOnClickListener {
            // Acción a realizar al hacer clic en el CardView (abrir EstadisticasActivity)
            val intent = Intent(this, Estadisticas::class.java)
            startActivity(intent)
        }

    }
}