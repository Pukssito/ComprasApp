package com.example.myfirstapp.app.compras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.myfirstapp.R

class AgregarListaCompra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etText)
        btnStart.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
//                Log.i("GabrielDev","Bienvenido: ${etName.text.toString()}")

                // this quiere decir que es esta actividad
                // el intent es para cambiar de pantalla y ademas puedes llevarse valores..
                val intent = Intent(this, ResultadoActivity::class.java)
                // para llevarse valores se pone con clave/valor
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }
    }
}