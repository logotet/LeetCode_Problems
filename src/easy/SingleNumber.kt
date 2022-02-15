package easy
//No. 136
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val numsSorted = nums.sorted()
        var unique: Int = numsSorted[0]
        if(numsSorted.size>1){
            unique = numsSorted[numsSorted.size-1]
        }
        var i = 0
        while(i < nums.size-2){
            if (numsSorted[i] == numsSorted[i + 1]) {
                i += 2
            }else{
                try{
                    if(numsSorted[i-1] == numsSorted[i]){
                        unique = numsSorted[i+1]
                        break
                    }else{
                        unique = numsSorted[i]
                        break
                    }
                }catch (e: IndexOutOfBoundsException){
                    unique = numsSorted[0]
                    break
                }
            }
        }
        return unique
    }
}