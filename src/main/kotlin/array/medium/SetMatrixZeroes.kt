package array.medium

class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val row = HashSet<Int>()
        val colum = HashSet<Int>()

        val rowSize: Int = matrix.size
        val columSize: Int = matrix[0].size

        for (i in 0 until rowSize) {
            for (j in 0 until columSize) {
                if (matrix[i][j] === 0) {
                    row.add(i)
                    colum.add(j)
                }
            }
        }




        for (i in 0 until rowSize) {
            for (j in 0 until columSize) {
                if (row.contains(i) || colum.contains(j)) {
                    matrix[i][j] = 0
                }
            }
        }
    }
}