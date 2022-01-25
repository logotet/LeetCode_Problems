package medium
//No. 3
class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        var c = 0
        var longest = ""
        var current = ""
        while(c < s.length){
            if(!current.contains(s[c])){
                current += s[c]
            }else{
                val index = (current.indexOf(s[c])) +1
                val substring = current.substring(index)
                current = substring + s[c].toString()
            }
            if(current.length > longest.length){
                longest = current
            }
            c++
        }
        return longest.length
    }
}