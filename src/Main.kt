fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 2

    for (i in nums.indices) {
        try{
        if (nums[i] == target) {
            print(i)
            break
        } else if (target > nums[i] && target < nums[i + 1]) {
            print(i+1)
        }
        }catch (e: IndexOutOfBoundsException){
            print(nums.size)
        }

    }
}
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            try{
                if (nums[i] == target) {
                    return i
                    break
                } else if (target > nums[i] && target < nums[i + 1]) {
                    return i+1
                }
            }catch (e: IndexOutOfBoundsException){
                return nums.size
            }
        }
        return -1
    }
}

//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4