package com.example.androidtesting.utils

class Helper {

    fun isPalindrome(input: String): Boolean { // Press-> Alt + Ins for generating the Test function
        var i = 0
        var j = input.length - 1
        var result = true

        while (i < j) {
            if (input[i] != input[j]) {
                result = false
                break
            }
            i++
            j--
        }
        return result
    }
}
