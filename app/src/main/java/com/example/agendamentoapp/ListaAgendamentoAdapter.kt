package com.example.agendamentoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListaAgendamentoAdapter(private val agendamentoList: List<ListaAgendamentos>) :
    RecyclerView.Adapter<ListaAgendamentosHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaAgendamentosHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_agendamentos_view, parent, false)
        return ListaAgendamentosHolder(view)
    }

    override fun getItemCount(): Int {
        return agendamentoList.size
    }

    override fun onBindViewHolder(holder: ListaAgendamentosHolder, position: Int) {
        val item = agendamentoList[position]
        holder.agendamentoTextView.text = item.dataAgendamento
        holder.statusAgendamentoTextView.text = item.statusAgendamento
        holder.nomeAgendamentoTextView.text = item.nomeAgendado
    }
}