package com.example.univital

import java.text.SimpleDateFormat
import java.util.Date

object FechaUtil {

    fun obtenerFechaActual(): String {
        val formato = SimpleDateFormat("dd/MM/yyyy")
        val fecha = Date(System.currentTimeMillis())
        return formato.format(fecha)
    }
}
