package com.example.agendamentoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.agendamentoapp.ui.theme.AgendamentoAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layouttelainicio)


        btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener() {
            val initHome = Intent(this, HomeActivity::class.java)
            startActivity(initHome)
        }
    }
}
