package com.example.agendamentoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaAgendamentosHolder(listaAgendamentos: View) : RecyclerView.ViewHolder(listaAgendamentos) {
    val agendamentoTextView: TextView = listaAgendamentos.findViewById(R.id.agendamentoTextView)
    val statusAgendamentoTextView: TextView = listaAgendamentos.findViewById(R.id.statusAgendamentoTextView)
    val nomeAgendamentoTextView: TextView = listaAgendamentos.findViewById(R.id.nomeAgendamentoTextView)
}