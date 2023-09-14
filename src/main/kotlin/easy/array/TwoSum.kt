package easy.array

/*
Maintain a map of number and index
Put key in map target-first item > 0
Run loop 1 to last
  if item in map
     then return index from map and current index
  else
     update map with key target-current item > current index
 */

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        var  numberIndexMap: MutableMap<Int, Int>  = mutableMapOf()
        numberIndexMap[target - nums[0]] = 0

        for(i in 1 until nums.size){

            if(numberIndexMap.containsKey(nums[i])){
               val index=  numberIndexMap[nums[i]] ?: 0

                return intArrayOf(i, index)
            }
            else{
                numberIndexMap[target - nums[i]] = i
            }

        }

        return intArrayOf()
    }
}