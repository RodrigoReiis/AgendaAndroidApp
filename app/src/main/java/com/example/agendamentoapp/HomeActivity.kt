package com.example.agendamentoapp

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class HomeActivity :  ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)


        val itemList = listOf(
            ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
            //ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
            //ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
        )

        val recycleView: RecyclerView = findViewById<RecyclerView>(R.id.listSchedule);
        val itemAdapter = ListaAgendamentoAdapter(itemList)
        recycleView.adapter = itemAdapter
        recycleView.layoutManager = LinearLayoutManager(this)

    }
}

