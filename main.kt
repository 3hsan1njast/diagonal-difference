fun main() {
    println(utopianTree(4))
}

fun utopianTree(n: Int): Int {
    var height = 1
    (0..<n).forEach { i ->
        if (i % 2 == 0) height *= 2
        else height++
    }
    return height
}