package array.medium

class RotateArray {


    fun rotate(nums: IntArray, k: Int) {
        var k = k
        k %= nums.size
        val n = nums.size
        reverseNum(nums, 0, n - 1)
        reverseNum(nums, 0, k - 1)
        reverseNum(nums, k, n - 1)
    }

    fun reverseNum(nums: IntArray, start: Int, end: Int) {
        var start = start
        var end = end
        while (start < end) {
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }


}