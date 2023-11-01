package array.easy

/*
Run loop from last to start index
  if current item less than 9 then add one and return
update zero position 1 and return the array
 */

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size-1 downTo 0){
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0
        }


            var  list = digits.toList().toMutableList()
            list.add(0,1)
            return list.toIntArray()

        return digits
    }
}