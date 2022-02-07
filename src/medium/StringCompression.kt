package medium

class StringCompression {
    fun solution(str: String): String {
        val charArrays = str.toCharArray()
        var count = 1
        var i = 1
        var result = ""

        while (i <= str.length - 1) {
            if (str[i] == str[i - 1]) {
                count++
            } else {
                if (count > 1) {
                    result += count
                    result += str[i - 1]
                } else {
                    result += str[i - 1]
                }
                count = 1
            }
            i++
        }
        result += count
        result += str[i - 1]
        return result
    }
}