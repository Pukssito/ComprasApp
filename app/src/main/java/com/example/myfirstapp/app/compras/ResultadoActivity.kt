package com.example.myfirstapp.app.compras

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // para llamar a la otra pantalla se llama a intent y se recupera la clave / valor que queremos
        //aqui utilizamos los ? para evitar los nullable y que nos de un vacio si no hay texto
        val name: String? = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola ${name}"
    }
}
