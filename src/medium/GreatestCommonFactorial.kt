package medium

class GreatestCommonFactorial {
    fun solution(num1: Int, num2: Int): Int {
        var bigger: Int
        var smaller: Int
        var remainder: Int
        if (num1 > num2) {
            bigger = num1
            smaller = num2
        } else if (num1 < num2) {
            bigger = num2
            smaller = num1
        } else {
            bigger = num1
            smaller = num1
            print(num1)
        }
        remainder = bigger % smaller
        while (remainder != 0) {
            bigger = smaller
            smaller = remainder
            remainder = bigger % smaller
        }
        return smaller
    }
}