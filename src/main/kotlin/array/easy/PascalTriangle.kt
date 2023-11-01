package array.easy

class PascalTriangle {

    fun generate(numRows: Int): List<List<Int>> {

         var result = mutableListOf<MutableList<Int>>()

        for(i in 0 until numRows){

            var item = mutableListOf<Int>()

            for (j in 0..i){
                if(j == 0 ){
                    item.add(1)
                }
                else{
                    var preList = result[i-1]
                    item.add(preList[j-1] + if(j < preList.size) preList[j] else 0)
                }
            }
            result.add(item)
        }

        return result
    }
}