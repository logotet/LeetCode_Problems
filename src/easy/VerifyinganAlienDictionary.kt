package easy
//No. 953
class VerifyinganAlienDictionary {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        var isIt = true

        outer@ for (j in words.indices) {
            try {
                val word1 = words[j]
                val word2 = words[j + 1]
                for (i in word1.indices) {
                    try {
                        if (getCharIndex(order, word1[i]) < getCharIndex(order, word2[i])) {
                            isIt = true
                            break
                        } else if (getCharIndex(order, word1[i]) == getCharIndex(order, word2[i])) {
                            continue
                        } else if (getCharIndex(order, word1[i]) > getCharIndex(order, word2[i])) {
                            isIt = false
                            break@outer
                        }
                    } catch (e: StringIndexOutOfBoundsException) {
                        isIt = word1.toCharArray().size < word2.toCharArray().size
                    }
                }
            } catch (e: IndexOutOfBoundsException) {
                break
            }
        }
        return isIt
    }

    private fun getCharIndex(order: String, char: Char): Int {
        for (c in order.withIndex()) {
            if (c.value == char) {
                return c.index
            }
        }
        return -1
    }
}