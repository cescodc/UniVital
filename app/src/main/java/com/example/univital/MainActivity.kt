package com.example.univital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPhysicalActivity: Button = findViewById(R.id.btnPhysicalActivity)
        val btnDietTracking: Button = findViewById(R.id.btnDietTracking)
        val btnMeditation: Button = findViewById(R.id.btnMeditation)
        val btnNotifications: Button = findViewById(R.id.btnNotifications)
        val btnStatistics: Button = findViewById(R.id.btnEstadistic)

        btnPhysicalActivity.setOnClickListener {
            // Lógica para abrir la pantalla de registro de actividad física
            startActivity(Intent(this, ActividadFisica::class.java))
        }

        btnDietTracking.setOnClickListener {
            // Lógica para abrir la pantalla de seguimiento de la dieta
           // startActivity(Intent(this, DietTrackingActivity::class.java))
        }

        btnMeditation.setOnClickListener {
            // Lógica para abrir la pantalla de meditación y bienestar emocional
            startActivity(Intent(this, ActivityMeditacion::class.java))
        }

        btnNotifications.setOnClickListener {
            // Lógica para abrir la pantalla de notificaciones y recordatorios
            //startActivity(Intent(this, NotificationsActivity::class.java))
        }

        btnStatistics.setOnClickListener {
            // Lógica para abrir la pantalla de estadísticas e informes
            //startActivity(Intent(this, StatisticsActivity::class.java))
        }
    }
}