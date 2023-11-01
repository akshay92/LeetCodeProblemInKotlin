package array.medium

import java.util.*

class LargestNumber {

    fun largestNumber(nums: IntArray): String {
        val s = arrayOfNulls<String>(nums.size)
        for (i in nums.indices) {
            s[i] = nums[i].toString()
        }
        val sb = StringBuilder("")
        Arrays.sort(s) { a, b -> (b + a).compareTo(a + b) }
        for (str in s) {
            sb.append(str)
        }
        val result = sb.toString()
        return if (result.startsWith("0")) "0" else result
    }
}