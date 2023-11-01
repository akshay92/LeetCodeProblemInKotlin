package array.medium

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {

        var max = 0
        var lastMaxIndex = 0

        for(i in 0 until  height.size){
            if(i == 0 || height[lastMaxIndex] >= height[i]) {
                max = Math.max(max, height[i] * (i - lastMaxIndex))
            }
            else{
                lastMaxIndex = i
            }
        }

        return max
    }
}