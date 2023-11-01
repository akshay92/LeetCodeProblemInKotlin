package array.medium

class FirstAndLastPositionOfElementInSortedArray {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        var output: IntArray = IntArray(2)
        var isFirstItemSet = false

        nums.forEachIndexed { index, item ->

            if(item == target){
                if(!isFirstItemSet){
                    isFirstItemSet= true
                    output[0]=index
                }
                else {
                    output[1] = index
                }
            }
        }
        
        return output
    }

}