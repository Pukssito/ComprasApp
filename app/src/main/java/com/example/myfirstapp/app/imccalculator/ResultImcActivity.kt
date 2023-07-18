package com.example.myfirstapp.app.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.myfirstapp.R
import com.example.myfirstapp.app.cons.Constantes.Companion.IMC_KEY


class ResultImcActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_imc)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUi(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUi(result: Double) {
        tvIMC.text = result.toString()
        when(result){
           in 0.00..18.50 -> { //bajo peso
               tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
               tvResult.text = getString(R.string.title_bajo_peso)
               tvDescription.text = getString(R.string.description_bajo_peso)
           }
            in 18.51..24.99 -> { //peso normal
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                tvResult.text = getString(R.string.title_peso_normal)
                tvDescription.text = getString(R.string.description_peso_normal)
            }
            in 25.00..29.99 -> { //sobrepeso
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.sobrepeso))
                tvResult.text = getString(R.string.title_sobrepeso)
                tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00..99.00 -> { //obesidad
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesidad))
                tvResult.text = getString(R.string.title_obesidad)
                tvDescription.text = getString(R.string.description_obesidad)
            }
            else -> { //error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesidad))
            }
        }
    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescripcion)
        btnRecalculate = findViewById(R.id.btnReCalculate)
    }
}