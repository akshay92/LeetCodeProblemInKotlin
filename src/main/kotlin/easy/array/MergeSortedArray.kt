package easy.array

/*
If two array size m and n then make one array size m+n with 0 value
i point last item one array
j point last item of second array
k point to last of index of array one
Run a loop second array all item move to traverse j>=0
if i < 0 || array one item less than array second
    then set second array to k
     k--
     j--
else
   set array one item
    k--
    i--
 */

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n -1
        while (j >= 0) {
            nums1[k--] = if (i < 0 || nums1[i] < nums2[j]) nums2[j--] else nums1[i--]
        }
    }
}