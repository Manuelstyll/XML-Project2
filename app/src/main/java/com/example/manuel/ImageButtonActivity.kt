package com.example.manuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButtonActivity : AppCompatActivity() {

    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var minus: Button
    lateinit var multiply: Button
    lateinit var divide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        number1 = findViewById(R.id.num1)
        number2 = findViewById(R.id.num2)
        image = findViewById(R.id.imgbtn)
        minus = findViewById(R.id.minus)
        multiply = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)

        image.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(
                    applicationContext,
                    "Sum of the numbers is " + (num1 + num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        minus.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(
                    applicationContext,
                    "Sum of the numbers is " + (num1 - num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        multiply.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(
                    applicationContext,
                    "Sum of the numbers is " + (num1 * num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        divide.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(
                    applicationContext,
                    "Sum of the numbers is " + (num1 / num2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}