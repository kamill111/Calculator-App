package com.itis.calculator

class MathOperations(val num1: Int, val num2: Int) {

    //Phương thức cộng hai số
    fun add(): Int {
        return num1 + num2
    }

    fun subtract(): Int {
        return num1 - num2
    }

    fun multiply(): Int {
        return num1 * num2
    }

    fun divide(): Int {
        return if (num2 != 0) num1 / num2 else 0
    }

    //phương thức kiểm tra số thuộc khoảng nào
    fun checkRange(number: Int): String {
        return when (number) {
            in 1..10 -> "Number is between 1 and 10"
            in 11..20 -> "Number is between 11 and 20"
            in 21..30 -> "Number is between 21 and 30"
            else -> "Number is out of range"
        }
    }
}