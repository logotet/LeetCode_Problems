import java.util.*

fun main() {
    val nums = intArrayOf(1)
    val target = 1
//  Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Input: nums = [], target = 0
//Output: [-1,-1]

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
   print(Arrays.toString(intArrayOf(startPoint,endPoint)))
//    return intArrayOf(startPoint, endPoint)
}
