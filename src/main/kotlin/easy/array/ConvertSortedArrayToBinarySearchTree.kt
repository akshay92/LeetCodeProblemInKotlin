package easy.array

import common.TreeNode
/*
Middle element is root
left is low
right is high
 */

class ConvertSortedArrayToBinarySearchTree {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return getRoot(nums, 0, nums.size - 1);
    }

    fun getRoot(nums: IntArray, low: Int, hight: Int): TreeNode? {
        if (low > hight) {
            return null
        }

        val mid = (low + hight) / 2
        val root = TreeNode(nums[mid])
        root.left = getRoot(nums, low, mid - 1)
        root.right = getRoot(nums, mid + 1, hight)
        return root
    }

}