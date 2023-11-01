package array.hard

class TrappingRainWater {

    fun trap(h: IntArray): Int {
        var l = 0
        var r: Int = h.size - 1
        var lmax = Int.MIN_VALUE
        var rmax = Int.MIN_VALUE
        var ans = 0
        while (l < r) {
            lmax = Math.max(lmax, h.get(l))
            rmax = Math.max(rmax, h.get(r))
            ans += if (lmax < rmax) lmax - h.get(l++) else rmax - h.get(r--)
        }
        return ans
    }

}