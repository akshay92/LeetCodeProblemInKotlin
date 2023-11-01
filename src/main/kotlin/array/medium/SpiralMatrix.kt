package array.medium

class SpiralMatrix {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var result = mutableListOf<Int>()

        var top = 0
        var left = 0
        var right = matrix[0].size - 1
        var bottom = matrix.size - 1

        while (true) {

            // left to right
            for (i in top..right) {
                result.add(matrix[top][i])
            }
            top++

            if (top > bottom) {
                break;
            }

            // top to bottom
            for (i in top..bottom) {
                result.add(matrix[i][right])
            }
            right--

            if (left > right) {
                break;
            }


            // right to left
            for (i in right downTo left) {
                result.add(matrix[bottom][i])
            }
            bottom--
            if (top > bottom) {
                break;
            }


            // bottom to top
            for (i in bottom downTo top) {
                result.add(matrix[i][left])
            }
            left++


            if (left > right) {
                break;
            }


        }


        return result
    }
}