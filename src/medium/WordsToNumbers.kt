// unresolved
fun main() {
    val mathMap = mutableMapOf<String, Char>(
        "one" to '1',
        "two" to '2',
        "three" to '3',
        "four" to '4',
        "five" to '5',
        "six" to '6',
        "seven" to '7',
        "eight" to '8',
        "nine" to '9',
        "minus" to '-',
        "plus" to '+'
    )

    val str = "foursixminustwotwoplusonezero"
    var replaceMinus = str.replace("minus", "-")
    var replacedSigns = replaceMinus.replace("plus", "+")
    print(replacedSigns)

    var splittedNumbers = replacedSigns.split("+", "-")
    print(splittedNumbers)
    var numberWord = ""
    for (word in splittedNumbers) {
        for (c in word) {
            numberWord += c
            if (mathMap.get(numberWord) != null) {
                val get = mathMap.get(numberWord)
                println(get)
                word.replace(numberWord, get.toString())
                numberWord = ""
            }
        }
    }


//        for(c in replacedSigns){
//            if(c != '-' || c !='+') {
//                numberWord += c
//                if (mathMap.get(numberWord) != null) {
//                    println(mathMap.get(numberWord))
//                    numberWord = ""
//                }
//            }else{
//        }

    println(splittedNumbers)
}