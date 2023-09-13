package easy.array

/*
Start loop from last to start

if last value more than current value
we need to add number current value
else
minus number current value

update last value to current value 
 */

class RomanToInteger {

    fun romanToInt(s: String): Int {


        var charValue = 0
        var lastValue = 0
        var number = 0

        for (i in s.lastIndex downTo 0) {
            charValue = when (s[i]) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }

            if (lastValue <= charValue) {
                number += charValue
            } else {
                number -= charValue
            }

            lastValue = charValue
        }

        return number
    }
}