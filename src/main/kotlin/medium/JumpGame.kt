package medium

import kotlin.math.max

class JumpGame {

    fun canJump(nums: IntArray): Boolean {
        var max = 0

        for(i in nums.indices){
            if(i>max) return false

            max = max(nums[i]+i, max)
        }
        return true
    }

}