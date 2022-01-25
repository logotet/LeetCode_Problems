package easy
//No. 2032
class TwoOutOfThree {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val distinct = mutableListOf<Int>()
        for(n1 in nums1){
            for(n2 in nums2){
                if(n1 == n2){
                    distinct.add(n1)
                }
            }
        }
        for(n1 in nums2){
            for(n2 in nums3){
                if(n1 == n2){
                    distinct.add(n1)
                }
            }
        }
        for(n1 in nums1){
            for(n2 in nums3){
                if(n1 == n2){
                    distinct.add(n1)
                }
            }
        }
        return distinct.distinct()
    }
}