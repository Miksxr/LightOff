package com.example.lightoff.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.lightoff.MainActivity
import com.example.lightoff.R
import com.example.lightoff.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var loginEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)

        loginEditText = binding.Login
        passwordEditText = binding.Password
        val signInButton = binding.Come

        signInButton.setOnClickListener {
            val enteredLogin = loginEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            if (enteredLogin == "Petrov" && enteredPassword == "Light") {
                // Логин и пароль верны, переходим на MainActivity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Логин и пароль неверны, можно вывести сообщение об ошибке
                Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}