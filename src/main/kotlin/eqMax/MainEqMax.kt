package eqMax

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val array: ArrayList<Int> = arrayListOf(scan.nextInt())
    var input = array[0]
    var max = input

    while (input != 0) { // Ввод чисел до 0
        input = scan.nextInt()
        array.add(input)
        if (max < input) max = input
    }
    println(eqMax(array, max))
}

fun eqMax(array: ArrayList<Int>, max: Int): Int {
    var count = 0
    repeat(array.size) {
        if (array[it] == max && max != 0) count ++
    }
    return count
}