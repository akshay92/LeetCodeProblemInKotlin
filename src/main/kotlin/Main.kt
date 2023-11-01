import array.hard.TrappingRainWater
import array.medium.FirstAndLastPositionOfElementInSortedArray
import array.medium.RotateArray

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val obje = TrappingRainWater()
//
//    var arrayOfNumber = intArrayOf(4,2,0,3,2,5)
//    println("Program arguments:  ${obje.trap(arrayOfNumber)}")
//
//
//    var arrayOfNumber1 = intArrayOf(0,2,0)
//    println("Program arguments:  ${obje.trap(arrayOfNumber1)}")

    var arrayOfNumber2 = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
    println("Program arguments:  ${obje.trap(arrayOfNumber2)}")



}




class Test private  constructor(){

    companion object {

        private var instance : Test?= null
        fun getInstance() =
            instance?.let { instance } ?: Test().apply{ instance = this }


    }


}