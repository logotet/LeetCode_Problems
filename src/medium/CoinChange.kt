fun main() {
//    val coins = intArrayOf(186,419,83,408)
//    var amount = 6249
//    val coins = intArrayOf(1,4,8,9)
//    var amount = 12
//    val coins = intArrayOf(1)
//    var amount = 0
    val coins = intArrayOf(1,2,5)
    var amount = 11
    var counter = 0
    var x = coins.size - 1
    val coinsSorted = coins.sorted().toMutableList()
    var fewestCoins = coins.size

//    for(i in coinsSorted.size-1 downTo 0){
//        if(amount % coinsSorted[i] == 0){
//            amount %= co
//        }
//    }


    for(i in coinsSorted.size-1 downTo 0){
        if ((amount % coinsSorted[i]) == 0) {
            counter += amount / coinsSorted[i]
            coinsSorted.remove(i)
            break
        }else if(amount >= coinsSorted[i]){
            counter += amount / coinsSorted[i]
            amount = amount % coinsSorted[i]
        }
    }

//    while(x >= 0){
//        if(amount >= coinsSorted[x]){
//            counter += amount / coinsSorted[x]
//            amount = amount % coinsSorted[x]
//        }else{
//            x--
//        }
//    }


    if(amount == 0) {
        print(counter)
    }else{
        println(-1)
    }
}
//[186,419,83,408]
//6249

//Example 1:
//
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1
//
//Example 2:
//
//Input: coins = [2], amount = 3
//Output: -1
//
//Example 3:
//
//Input: coins = [1], amount = 0
//Output: 0