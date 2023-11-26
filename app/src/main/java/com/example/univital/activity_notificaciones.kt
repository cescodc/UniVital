package com.example.univital

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class activity_notificaciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificaciones)

        val buttonMarcarLeidas: Button = findViewById(R.id.button2)
        val layoutNotificaciones: LinearLayout = findViewById(R.id.layoutNotificaciones)

        val info1TextView: TextView = findViewById(R.id.info1)
        val info2TextView: TextView = findViewById(R.id.info2)
        val info3TextView: TextView = findViewById(R.id.info3)
        val info4TextView: TextView = findViewById(R.id.info4)
        val info5TextView: TextView = findViewById(R.id.info5)



        //Notificaciones

        info1TextView.text = "Recordatorios de Entrenamiento:\n" +
                "\n" +
                "\" ¡Hora de entrenar! ¿Listo para tu sesión de ejercicio de hoy?\""

        info2TextView.text = "Recordatorios de Hidratación y Descanso:\n" +
                "\n" +
                "\"¡Hidrátate! Beber agua es esencial después del ejercicio.\""

        info3TextView.text = "Motivación y Mensajes Positivos:\n" +
                "\n" +
                "\"¡Esfuérzate hoy y serás más fuerte mañana!\""

        info4TextView.text = "Actualizaciones de la Comunidad:\n" +
                "\n" +
                "\"Tus amigos están entrenando hoy. Únete y compite.\""

        info5TextView.text = "Estadísticas Diarias:\n" +
                "\n" +
                "\"Llevas 50 kilómetros recorridos esta semana. ¡Impresionante!\""


        buttonMarcarLeidas.setOnClickListener {
            marcarTodasComoLeidas(layoutNotificaciones)
        }
    }



    private fun marcarTodasComoLeidas(layoutNotificaciones: LinearLayout) {

        val idsToMarcar = listOf(
            R.id.info1,
            R.id.info2,
            R.id.info3,
            R.id.info4,
            R.id.info5
        )

        for (i in 0 until layoutNotificaciones.childCount) {
            val childView = layoutNotificaciones.getChildAt(i)
            if (childView is TextView && idsToMarcar.contains(childView.id)) {
                childView.setBackgroundColor(Color.parseColor("#F7F7F7"))
            }
        }
    }

    fun mostrarMenuCompartir(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.menu_compartir, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.opcion_compartir_facebook -> {
                        //Compartir en Facebook
                        return true
                    }
                    R.id.opcion_compartir_twitter -> {
                        //Compartir en Twitter
                        return true
                    }

                    else -> return false
                }
            }
        })

        popupMenu.show()
    }

    fun Volver(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        //Comando Toas, sirve para mandar un mensaje inmediatamente después de accionar un botón.
        Toast.makeText(applicationContext, "Nos vemos :)", Toast.LENGTH_SHORT).show()
    }
}
