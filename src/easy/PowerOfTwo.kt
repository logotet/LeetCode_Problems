package easy
//No. 231
class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        var m = n
        var remainder = 0
        var isIt = true
        while (remainder == 0 && m != 1 && m != 0) {
            remainder = m % 2
            m /= 2

        }

        if (remainder != 0 || m == 0) {
            isIt = false
        }

        return isIt
    }
}