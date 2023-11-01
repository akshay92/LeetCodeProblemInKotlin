package array.easy

/*
Maintain var for unique count
Run a loop
   if unique == 0 || current item > previous unique item
      update item array to current item


 */
class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var i:Int = 0

        for(n in nums){
            if(i==0 || n > nums[i-1]){
                nums[i++] = n
            }

        }

        return i
    }
}