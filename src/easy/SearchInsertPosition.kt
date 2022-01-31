package easy

class SearchInsertPosition {
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
        return 0
    }
}