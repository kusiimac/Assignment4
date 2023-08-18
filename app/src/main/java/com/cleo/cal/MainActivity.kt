package com.cleo.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.cleo.cal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstNumberEditText = findViewById<EditText>(R.id.first_number)
        val secondNumberEditText: EditText = findViewById(R.id.second_number)
        val addButton = findViewById<Button>(R.id.add_button)
        val subtractButton = findViewById<Button>(R.id.subtract_button)
        val multiplyButton = findViewById<Button>(R.id.multiply_button)
        val divideButton = findViewById<Button>(R.id.divide_button)
        val displayResult = findViewById<TextView>(R.id.results)
        val image: ImageView = binding.imageArray

        addButton.setOnClickListener {

            if (firstNumberEditText.text.toString() == "" ){
                return@setOnClickListener
            }
            else if (secondNumberEditText.text.toString() == ""){
                return@setOnClickListener
            }

                val firstNumber = firstNumberEditText.text.toString().toDouble()
                val secondNumber = secondNumberEditText.text.toString().toDouble()
                val result = firstNumber + secondNumber
                displayResult.text = "$result"

        }
        subtractButton.setOnClickListener {
            if (firstNumberEditText.text.toString() == "" ){
                return@setOnClickListener
            }
            else if (secondNumberEditText.text.toString() == ""){
                return@setOnClickListener
            }

            val firstNumber = firstNumberEditText.text.toString().toDouble()
            val secondNumber = secondNumberEditText.text.toString().toDouble()
            val result = firstNumber - secondNumber
            displayResult.text = "$result"
        }
        multiplyButton.setOnClickListener {
            if (firstNumberEditText.text.toString() == "" ){
                return@setOnClickListener
            }
            else if (secondNumberEditText.text.toString() == ""){
                return@setOnClickListener
            }

            val firstNumber = firstNumberEditText.text.toString().toDouble()
            val secondNumber = secondNumberEditText.text.toString().toDouble()
            val result = firstNumber * secondNumber
            displayResult.text = "$result"
        }
        divideButton.setOnClickListener {
            if (firstNumberEditText.text.toString() == "" ){
                return@setOnClickListener
            }
            else if (secondNumberEditText.text.toString() == ""){
                return@setOnClickListener
            }

            val firstNumber = firstNumberEditText.text.toString().toDouble()
            val secondNumber = secondNumberEditText.text.toString().toDouble()
            val result = firstNumber / secondNumber

            displayResult.text = "$result"
        }
        displayResult.setOnClickListener {
            val imageArray = arrayOf(R.drawable.bear, R.drawable.dolphins,
                R.drawable.puppies, R.drawable.cat, R.drawable.fish)
            image.setImageResource(imageArray.random())
        }
    }
}
