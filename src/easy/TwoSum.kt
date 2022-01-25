package easy
//No. 1
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (n in nums.withIndex()){
            for(m in nums.withIndex()){
                if(n.index != m.index && (n.value + m.value) == target){
                    return intArrayOf(n.index, m.index)
                }
            }
        }
        return intArrayOf(0)
    }
}