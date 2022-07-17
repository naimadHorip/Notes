package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var number = 0
    private lateinit var clNumber: ConstraintLayout
    private lateinit var tvNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clNumber = findViewById(R.id.clNumber)
        tvNumber = findViewById(R.id.tvNumber)

        clNumber.setOnClickListener {
            click()
        }

        clNumber.setOnLongClickListener {
            reset()
            true
        }
    }

    private fun click() {
        number++
        setText()
    }

    private fun reset() {
        number = 0
        setText()
    }

    private fun setText() {
        tvNumber.text = number.toString()
    }
}