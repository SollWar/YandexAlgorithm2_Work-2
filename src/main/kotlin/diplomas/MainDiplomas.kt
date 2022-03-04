package diplomas

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val folders = scan.nextInt()
    var max = 0
    var sum = 0
    var input: Int

    repeat (folders) {
        input = scan.nextInt()
        sum += input
        if (max < input) {
            max = input
        }
    }

    print(sum - max)
}