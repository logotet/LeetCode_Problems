fun main() {
    val s = "abcabedbb"
//    val s = "bbbbbb"
//    val s = "pwwkew"

    var longest = ""
//    for(c in s){
//        var current = ""
//        if(!longest.contains(c, false)){
//            longest += c
//        }else{
//
//        }
//    }

//    for (c in s.indices) {
//        var current = ""
//        try {
//            if (s[c] != s[c + 1] && !current.contains(s[c], false)) {
//                current += s[c]
//            } else {
//                current = ""
////                c -= 1
//            }
//            if (current.length > longest.length) {
//                longest = current
//            }
//        } catch (e: IndexOutOfBoundsException) {
//            break
//        }
//    }
    var current = ""
    var c = 0
    while(c < s.length){
        try {
            if (s[c] != s[c + 1] && !current.contains(s[c], false)) {
                current += s[c]
            } else {
                current = ""
                continue
            }
            if (current.length > longest.length) {
                longest = current
            }
            c++
        } catch (e: IndexOutOfBoundsException) {
            break
        }
    }

        println(longest)
}


