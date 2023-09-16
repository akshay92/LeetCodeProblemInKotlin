import easy.array.PlusOne
import easy.array.RomanToInteger

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val rom = PlusOne()

    println("Program arguments: ${rom.plusOne(intArrayOf(9)).toList()}}")
    println("Program arguments: ${rom.plusOne(intArrayOf(1,2,3)).toList()}}")
    println("Program arguments: ${rom.plusOne(intArrayOf(4,3,2,1)).toList()}}")

}