package com.example.sergio_casalgerman_uf1_act7

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sergio_casalgerman_uf1_act7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Mostrar Toast
            Toast.makeText(this, "Login info captured", Toast.LENGTH_SHORT).show()

            // Registrar en Logcat
            Log.d(TAG, "Username: $username")
            Log.d(TAG, "Password: $password")
        }
    }
}