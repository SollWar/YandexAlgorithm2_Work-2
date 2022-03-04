package palindrome

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val input: String = scan.nextLine()
    println(palindrome(input))

}

fun palindrome(input: String): Int {
    var differChar: Int = 0
    val reverseInput: String = input.reversed() // Наверное лучше не переворачивать, а идти в цикле с конца

    repeat(input.length / 2) {
        if (input[it] != reverseInput[it]) differChar ++
    }

    return differChar
}