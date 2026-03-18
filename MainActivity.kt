

package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var weight: EditText
    lateinit var height: EditText
    lateinit var result: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weight = findViewById(R.id.etWeight)
        height = findViewById(R.id.etHeight)
        result = findViewById(R.id.tvResult)
        button = findViewById(R.id.btnCalculate)

        button.setOnClickListener {

            val w = weight.text.toString().toFloat()
            val h = height.text.toString().toFloat()

            val bmi = w / (h * h)

            result.text = "BMI = %.2f".format(bmi)
        }
    }
}
