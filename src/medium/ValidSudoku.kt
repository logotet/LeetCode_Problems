package medium
//No. 36
//The solution is slow and should be refactored
class ValidSudoku {
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            var isValid = true

            //row check
            for (row in board) {
                val currentRow = mutableListOf<Char>()
                var dotCounter = 0
                for (i in row.indices) {
                    if (row[i].isDigit()) {
                        currentRow.add(row[i])
                    } else {
                        dotCounter++
                    }
                }
                if ((currentRow.distinct().size + dotCounter) != row.size) {
                    isValid = false
                }
            }

            //column check
            for (col in 0..8) {
                val currentColumn = mutableListOf<Char>()
                var dotCounter = 0
                for (row in 0..8) {
                    if (board[row][col].isDigit()) {
                        currentColumn.add(board[row][col])
                    } else {
                        dotCounter++
                    }
                }
                if ((currentColumn.distinct().size + dotCounter) != 9) {
                    isValid = false
                }
            }

            //cell check
            for(i in 0..8 step 3){
                val cell = mutableListOf<Char>()
                var dotCounter = 0
                for(col in i..(i+2)){
                    for(row in 0..2){
                        if(board[row][col].isDigit()) {
                            cell.add(board[row][col])
                        }else{
                            dotCounter++
                        }
                    }
                }
                if ((cell.distinct().size + dotCounter) != 9) {
                    isValid = false
                }
            }

            for(i in 0..8 step 3){
                val cell = mutableListOf<Char>()
                var dotCounter = 0
                for(col in i..(i+2)){
                    for(row in 3..5){
                        if(board[row][col].isDigit()) {
                            cell.add(board[row][col])
                        }else{
                            dotCounter++
                        }
                    }
                }
                if ((cell.distinct().size + dotCounter) != 9) {
                    isValid = false
                }
            }

            for(i in 0..8 step 3){
                val cell = mutableListOf<Char>()
                var dotCounter = 0
                for(col in i..(i+2)){
                    for(row in 6..8){
                        if(board[row][col].isDigit()) {
                            cell.add(board[row][col])
                        }else{
                            dotCounter++
                        }
                    }
                }
                if ((cell.distinct().size + dotCounter) != 9) {
                    isValid = false
                }
            }


            return isValid
        }
    }

//fun main() {
//    val board = arrayOf(
//        arrayOf("5", "3", ".", ".", "7", ".", ".", ".", "."),
//        arrayOf("6", ".", ".", "1", "9", "5", ".", ".", "."),
//        arrayOf(".", "9", "8", ".", ".", ".", ".", "6", "."),
//        arrayOf("8", ".", ".", ".", "6", ".", ".", ".", "3"),
//        arrayOf("4", ".", ".", "8", ".", "3", ".", ".", "1"),
//        arrayOf("7", ".", ".", ".", "2", ".", ".", ".", "6"),
//        arrayOf(".", "6", ".", ".", ".", ".", "2", "8", "."),
//        arrayOf(".", ".", ".", "4", "1", "9", ".", ".", "5"),
//        arrayOf(".", ".", ".", ".", "8", ".", ".", "7", "9"),
//    )
//    var isValid = true
//
//    //row check
//    for (row in board) {
//        val currentRow = mutableListOf<Char>()
//        var dotCounter = 0
//        for (i in row.indices) {
//            //TODO for the solution remove first()
//            if (row[i].first().isDigit()) {
//                currentRow.add(row[i].first())
//            } else {
//                dotCounter++
//            }
//        }
//        if ((currentRow.distinct().size + dotCounter) != row.size) {
//            isValid = false
//        }
//    }
//
//    //column check
//    for (col in 0..8) {
//        val currentColumn = mutableListOf<Char>()
//        var dotCounter = 0
//        for (row in 0..8) {
//            if (board[row][col].first().isDigit()) {
//                currentColumn.add(board[row][col].first())
//            } else {
//                dotCounter++
//            }
//        }
//        if ((currentColumn.distinct().size + dotCounter) != 9) {
//            isValid = false
//        }
//    }
//
//    //cell check
//    for(i in 0..8 step 3){
//        val cell = mutableListOf<Char>()
//        var dotCounter = 0
//        for(col in i..(i+2)){
//            for(row in 0..2){
//                if(board[row][col].first().isDigit()) {
//                    cell.add(board[row][col].first())
//                }else{
//                    dotCounter++
//                }
//            }
//        }
//        if ((cell.distinct().size + dotCounter) != 9) {
//            isValid = false
//        }
//    }
//
//    for(i in 0..8 step 3){
//        val cell = mutableListOf<Char>()
//        var dotCounter = 0
//        for(col in i..(i+2)){
//            for(row in 3..5){
//                if(board[row][col].first().isDigit()) {
//                    cell.add(board[row][col].first())
//                }else{
//                    dotCounter++
//                }
//            }
//        }
//        if ((cell.distinct().size + dotCounter) != 9) {
//            isValid = false
//        }
//    }
//
//    for(i in 0..8 step 3){
//        val cell = mutableListOf<Char>()
//        var dotCounter = 0
//        for(col in i..(i+2)){
//            for(row in 6..8){
//                if(board[row][col].first().isDigit()) {
//                    cell.add(board[row][col].first())
//                }else{
//                    dotCounter++
//                }
//            }
//        }
//        if ((cell.distinct().size + dotCounter) != 9) {
//            isValid = false
//        }
//    }
//
//
//
//    print(isValid)
//
//
//}