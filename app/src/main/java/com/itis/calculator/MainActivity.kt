package com.itis.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1: EditText = findViewById(R.id.input1) //val - value giá trị của biến k thay đổi sau khi được khởi tạo
        val input2: EditText = findViewById(R.id.input2) //var - variable
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val btnSubtract: Button = findViewById(R.id.btnSubtract)
        val btnMultiply: Button = findViewById(R.id.btnMultiply)
        val btnDivide: Button = findViewById(R.id.btnDivide)
        val tvResult: TextView = findViewById(R.id.tvResult)
        val tvRange: TextView = findViewById(R.id.tvRange)

        btnAdd.setOnClickListener {
            val num1Str = input1.text.toString()
            val num2Str = input2.text.toString()

            val num1: Int = num1Str.toIntOrNull() ?: 0
            val num2: Int = num2Str.toIntOrNull() ?: 0

            //val result: Int = num1 + num2

//            val result = when {
//                num1 == num2 -> "number are equal"
//                num1 > num2 -> "Num1 is greater"
//                else -> "Num2 is greater"
//            }

            val mathOps = MathOperations(num1, num2)
            val result = mathOps.add()

            tvResult.text = "Addition result: $result"
            tvRange.text = mathOps.checkRange(result)
        }

        btnSubtract.setOnClickListener {
            val num1Str = input1.text.toString()
            val num2Str = input2.text.toString()

            val num1: Int = num1Str.toIntOrNull() ?: 0
            val num2: Int = num2Str.toIntOrNull() ?: 0

            val mathOps = MathOperations(num1, num2)
            val result = mathOps.subtract()

            tvResult.text = "Subtraction result: $result"
            tvRange.text = mathOps.checkRange(result)
        }

        btnMultiply.setOnClickListener {
            val num1Str = input1.text.toString()
            val num2Str = input2.text.toString()

            val num1: Int = num1Str.toIntOrNull() ?: 0
            val num2: Int = num2Str.toIntOrNull() ?: 0

            val mathOps = MathOperations(num1, num2)
            val result = mathOps.multiply()

            tvResult.text = "Multiplication result: $result"
            tvRange.text = mathOps.checkRange(result)
        }

        btnDivide.setOnClickListener {
            val num1Str = input1.text.toString()
            val num2Str = input2.text.toString()

            val num1: Int = num1Str.toIntOrNull() ?: 0
            val num2: Int = num2Str.toIntOrNull() ?: 0

            val mathOps = MathOperations(num1, num2)
            val result = mathOps.divide()

            tvResult.text = "Division result: $result"
            tvRange.text = mathOps.checkRange(result)
        }
    }
}