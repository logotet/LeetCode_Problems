import java.util.*

fun main() {
    val board = arrayOf(
        arrayOf("5", "3", ".", ".", "7", ".", ".", ".", "."),
        arrayOf("6", ".", ".", "1", "9", "5", ".", ".", "."),
        arrayOf(".", "9", "8", ".", ".", ".", ".", "6", "."),
        arrayOf("8", ".", ".", ".", "6", ".", ".", ".", "3"),
        arrayOf("4", ".", ".", "8", ".", "3", ".", ".", "1"),
        arrayOf("7", ".", ".", ".", "2", ".", ".", ".", "6"),
        arrayOf(".", "6", ".", ".", ".", ".", "2", "8", "."),
        arrayOf(".", ".", ".", "4", "1", "9", ".", ".", "5"),
        arrayOf(".", ".", ".", ".", "8", ".", ".", "7", "9"),
    )
    var isvalid = true

    //row check
    for (row in board) {
        val currentRow = mutableListOf<Char>()
        var dotCounter = 0
        for (i in row.indices) {
            //TODO for the solution remove first()
            if (row[i].first().isDigit()) {
                currentRow.add(row[i].first())
            } else {
                dotCounter++
            }
        }
        if ((currentRow.distinct().size + dotCounter) != row.size) {
            isvalid = false
        }
    }

    //column check
    for (i in 0..8) {
        val currentColumn = mutableListOf<Char>()
        var dotCounter = 0
        for (y in 0..8) {
            if (board[y][i].first().isDigit()) {
                currentColumn.add(board[y][i].first())
            } else {
                dotCounter++
            }
        }
        if ((currentColumn.distinct().size + dotCounter) != 9) {
            isvalid = false
        }
    }

    //cell check
    for (i in 0..8 step 3) {
        val cell = mutableListOf<Char>()
        var dotCounter = 0
        for (y in i..(i + 2)) {
            cell.add(board[y][i].first())
        }
        println(cell)

        0..2
        0..2

        0..2
        3..5

        0..2
        6..8
    }


    print(isvalid)


}