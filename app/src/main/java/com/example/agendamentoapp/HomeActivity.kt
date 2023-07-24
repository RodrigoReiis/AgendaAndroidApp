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
        val db = Firebase.firestore;

        val itemList = listOf(
            ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
            ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
            ListaAgendamentos("20/12/1994 20:00", "Aceito", "Rodrigo"),
        )

        val recycleView: RecyclerView = findViewById<RecyclerView>(R.id.listSchedule);
        val itemAdapter = ListaAgendamentoAdapter(itemList)
        recycleView.adapter = itemAdapter
        recycleView.layoutManager = LinearLayoutManager(this)

        /*val teste = db.collection("scheduleList")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("Home", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                    Log.w("Home", "Error getting documents.", exception)
            }
        */
        // Add a new document with a generated ID
        /*


        val user = hashMapOf(
            "first" to "Alan",
            "middle" to "Mathison",
            "last" to "Turing",
            "born" to 1912,
        )

        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }*/
    }
}

