fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    // Correct way to find the sum of elements
    val sum = doubledList.sumOf { it }
    println(sum) // Output: 30
    
    //Another Example
    val list2 = listOf("1","2","3")
    val sum2 = list2.sumOf { it.toInt() }
    println(sum2) //Output: 6
}