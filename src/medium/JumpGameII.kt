//No. 45
class JumpGameIIn {
    fun jump(nums: IntArray): Int {
        var maxJumpPower: Int
        var numberOfJumps = 0
        val finalPosition = nums.size - 1

        var i = 0
        while (i < finalPosition) {
            numberOfJumps++
            maxJumpPower = nums[i]
            val maxPosition = i + maxJumpPower
            if (maxPosition >= finalPosition) {
                break
            }
            var maxCombinedPower = 0
            var bestNextPosition: Int = 0
            for (j in i + 1..maxPosition) {
                if ((nums[j] + j) > maxCombinedPower) {
                    maxCombinedPower = nums[j] + j
                    bestNextPosition = j
                }
            }
            i = bestNextPosition
        }

        return numberOfJumps
    }
}
//val nums = intArrayOf(2, 3, 1, 1, 4)
//    val nums = intArrayOf(1,1,1,1,1)
//    val nums = intArrayOf(10,9,8,7,6,5,4,3,2,1,1,0)