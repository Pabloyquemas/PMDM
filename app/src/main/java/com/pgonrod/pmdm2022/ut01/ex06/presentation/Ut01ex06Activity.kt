package com.pgonrod.pmdm2022.ut01.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.pgonrod.pmdm2022.R
import com.pgonrod.pmdm2022.ut01.ex06.domain.Cat

class ut01ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex06)
        setupView()
    }
    private fun setupView() {
        val inputName = findViewById<EditText>(R.id.inputName)
        val inputSurname = findViewById<EditText>(R.id.inputSurname)
        val actionSave = findViewById<Button>(R.id.actionSave)

        actionSave.setOnClickListener {
            val cat = Cat(
                inputName.text.toString(),
                inputSurname.text.toString()
            )

            Log.d("@dev", "Cat: $cat")
        }
    }
}