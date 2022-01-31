package medium
//No. 34
class FindFirstAndLastPositionOfElement {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var startPoint = -1
        var endPoint = -1

        for(i in nums.indices){
            if(startPoint == -1 && target == nums[i]){
                startPoint = i
            }

            if(i != startPoint && i != -1 && target == nums[i] && i > endPoint){
                endPoint = i
            }
        }
        if(startPoint != -1 && endPoint == -1){
            endPoint = startPoint
        }
        return intArrayOf(startPoint, endPoint)
    }
}