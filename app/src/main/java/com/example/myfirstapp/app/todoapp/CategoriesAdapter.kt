package com.example.myfirstapp.app.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class CategoriesAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

    // se ha implementado una interfaz en la que nos fuerza a instalar estos metodos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_categories,parent,false)
        return CategoriesViewHolder(view)
    }
    // esta es la cantidad de categorias que va a mostrar se puede optimizar de esta manera omitiendo poner return.
    override fun getItemCount() = categories.size



    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
       holder.render(categories[position])
    }
}