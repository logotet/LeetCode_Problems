//unresolved
//No. 45
fun main() {
    val nums = intArrayOf(2,3,0,1,4)
//    val nums = intArrayOf(
//        10,9,8,7,6,5,4,3,2,1,1,0)
    var count = 0
    val finalIndex = nums.size - 1
    var maxJumpPower = 0

    var i = 0
    outer@ while (i < finalIndex) {
        maxJumpPower = nums[i]
        if ((maxJumpPower + i) >= finalIndex) {
            count++
            break@outer
        }
        var strongestJumper = 0
        var nextPosition = 0
        for (y in i+1..i+maxJumpPower) {
//              val closestPosition = (maxJumpPower + nums[y])
            if(nums[y] >= strongestJumper){
                strongestJumper = nums[y]
                nextPosition = y

            }
        }
        count++
        i = nextPosition
    }

    print(count)
}