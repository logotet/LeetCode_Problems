//TODO unresolved
//No. 78
fun main() {
    val nums = intArrayOf(9,0,3,5,7)
    val result = mutableListOf<List<Int>>()
    result.add(mutableListOf())

    for (i in nums.indices) {
        result.add(mutableListOf(nums[i]))
        var currentResult = mutableListOf(nums[i])
        var c = i
        while (c < nums.size - 2) {
            currentResult.add(nums[c + 1])
            if (!result.contains(currentResult.sorted())) {
                result.add(currentResult.sorted())
            }
            c++
        }
        c = i
        currentResult = mutableListOf(nums[i])
        while (c > 0) {
            currentResult.add(nums[c - 1])
            if (!result.contains(currentResult.sorted())) {
                result.add(currentResult.sorted())
            }
            c--
        }

        c = i
        if (i > 0) {
            currentResult = mutableListOf(nums[i - 1])
            while (c < nums.size - 1) {
                currentResult.add(nums[c + 1])
                if (!result.contains(currentResult.sorted())) {
                    result.add(currentResult.sorted())
                }
                c++
            }
        }

        c = i
        if (i < nums.size-1) {
            currentResult = mutableListOf(nums[i + 1])
            while (c > 0) {
                currentResult.add(nums[c - 1])
                if (!result.contains(currentResult.sorted())) {
                    result.add(currentResult.sorted())
                }
                c--
            }
        }

    }
    if (!result.contains(mutableListOf(nums[0], nums[nums.size-1]).sorted()) && nums.size > 1) {
        result.add(mutableListOf(nums[0], nums[nums.size - 1]).sorted())
    }
    println(result)
    println(result.distinct())
}
//expected
//[[],[9],[0],[0,9],[3],[3,9],[0,3],[0,3,9],[5],[5,9],[0,5],[0,5,9],[3,5],[3,5,9],[0,3,5],[0,3,5,9],[7]
// ,[7,9],[0,7],[0,7,9],[3,7],[3,7,9]
// ,[0,3,7],[0,3,7,9],[5,7],[5,7,9],[0,5,7],[0,5,7,9],[3,5,7],[3,5,7,9],[0,3,5,7],[0,3,5,7,9]]