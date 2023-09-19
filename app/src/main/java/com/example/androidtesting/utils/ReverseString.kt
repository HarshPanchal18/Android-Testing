package com.example.androidtesting.utils

class ReverseString {

    fun reverseString(input: String?): String {
        if(input == null)
            throw IllegalArgumentException("Input is required")

        val chars = input.toCharArray()
        var i = 0
        var j = chars.size - 1
        while (i < j) {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
        return chars.joinToString("")
    }

}
