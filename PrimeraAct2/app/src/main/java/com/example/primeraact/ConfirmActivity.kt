package com.example.primeraact

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val tvConfirmation = findViewById<TextView>(R.id.tvConfirmation)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val message = intent.getStringExtra("message")

        tvConfirmation.text = """
            ¡¡¡DATOS ENVIADOS CORRECTAMENTE!!!
            
            - Nombre: $name
            - Correo: $email
            - Mensaje: $message
        """.trimIndent()
    }
}
