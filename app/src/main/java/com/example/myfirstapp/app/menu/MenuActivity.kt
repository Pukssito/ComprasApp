package com.example.myfirstapp.app.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.R
import com.example.myfirstapp.app.imccalculator.ImcCalculatorActivity
import com.example.myfirstapp.app.compras.AgregarListaCompra
import com.example.myfirstapp.app.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTodo = findViewById<Button>(R.id.btnTodo)
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTodo.setOnClickListener { navigateToTodoApp() }
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this,TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
       val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

}