package shops

fun main() {
    val scan = java.util.Scanner(System.`in`)
    var input: Int

    val indShops: ArrayList<Int> = arrayListOf() // индексы магазинов
    val indHouses: ArrayList<Int> = arrayListOf() // индекс домов
    repeat(10) {
        input = scan.nextInt()
        when (input) {
            1 -> indHouses.add(it)
            2 -> indShops.add(it)
        }
    }

    println(shops(indShops, indHouses))
}

fun shops(indShops: ArrayList<Int>, indHouses: ArrayList<Int>): Int {
    var minDistance = 10
    var currentDistance = 0
    var maxDistance = 0

    for (house in indHouses) {
        for (shop in indShops) {
            currentDistance = kotlin.math.abs(house - shop)
            if (currentDistance < minDistance) minDistance = currentDistance
        }
        if (minDistance > maxDistance) maxDistance = minDistance
        minDistance = 10
    }

    return maxDistance
}