fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Incorrect way to find the sum of elements
    val sum = doubledList.sum()
    println(sum) //Output: 30

    //Correct Way to find the sum of elements
    val sum1 = doubledList.sumOf { it }
    println(sum1) // Output: 30
}