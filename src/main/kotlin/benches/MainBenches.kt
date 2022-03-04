package benches

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val l = scan.nextInt()
    val k = scan.nextInt()

    val array: IntArray = IntArray(k)

    repeat(k) {
        array[it] = scan.nextInt()
    }

    val total: ArrayList<Int> = benches(l, k, array)
    if (total.size > 1) {
        print("${total[0]} ${total[1]}")
    } else print(total[0])
}

fun benches(l: Int, k: Int, array: IntArray): ArrayList<Int> {
    val stay: ArrayList<Int> = arrayListOf()
    val center = l / 2
    var rightFound = false
    var rightLeg = 0
    var leftLeg = 0

    if (array.contains(center) && (l % 2 != 0)) {
        stay.add(center)
        return stay
    }

    for (i in array.indices) {
        if (!rightFound && array[i] >= center) {
            rightLeg = array[i]
            rightFound = true
        }
        if (array[i] < center) {
            leftLeg = array[i]
        }
    }

    stay.add(leftLeg)
    stay.add(rightLeg)

    return stay
}