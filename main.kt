import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primarySum = 0
    var secondarySum = 0

    for (row in arr.indices) {
        for (column in arr.indices) {
            if (row == column) {
                primarySum += arr[row][column]
                if (row + column == arr.size - 1) {
                    secondarySum += arr[row][column]
                }
            } else if (row + column == arr.size - 1) {
                secondarySum += arr[row][column]
            }
        }
    }

    return abs(primarySum - secondarySum)
}
