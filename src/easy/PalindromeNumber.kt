package easy
//No. 9
class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return x.toString().reversed() == x.toString()
    }
}