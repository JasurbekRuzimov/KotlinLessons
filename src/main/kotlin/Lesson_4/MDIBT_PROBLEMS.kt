package Lesson_4

fun findMode(array: List<Int>): List<Int> {
    val countMap = mutableMapOf<Int, Int>()

    for (num in array) {
        countMap[num] = countMap.getOrDefault(num, 0) + 1
    }

    var maxCount = 0
    val modes = mutableListOf<Int>()

    for ((key, count) in countMap) {
        if (count > maxCount) {
            maxCount = count
            modes.clear()
            modes.add(key)
        } else if (count == maxCount) {
            modes.add(key)
        }
    }

    return modes
}

fun sortArray(array: List<Int>): List<Int> {
    return array.sorted()
}

fun findMedian(array: List<Int>): Double {
    val sortedArray = array.sorted()
    val count = sortedArray.size

    return if (count % 2 == 1) {
        sortedArray[count / 2].toDouble()
    } else {
        val middle1 = sortedArray[count / 2 - 1]
        val middle2 = sortedArray[count / 2]
        (middle1 + middle2) / 2.0
    }
}

fun findDispersiya(array: List<Int>): Double {
    val n = array.size
    val mean = array.average()
    var sum = 0.0

    for (value in array) {
        sum += Math.pow(value - mean, 2.0)
    }

    return sum / n
}

fun findOrtacha(array: List<Int>): Double {
    return array.average()
}

fun findRang(array: List<Int>): List<Double> {
    val sortedArray = array.sorted()
    val rang = mutableListOf<Double>()

    var i = 0
    while (i < sortedArray.size) {
        var j = i
        while (j < sortedArray.size && sortedArray[i] == sortedArray[j]) {
            j++
        }

        val rangValue = (i + j + 1) / 2.0
        repeat(j - i) {
            rang.add(rangValue)
        }

        i = j
    }

    return rang
}

fun main() {
    val array = mutableListOf(3, 0, 5, 1, 1, 5, 3)
    val rangValues = findRang(array)
    val modes = findMode(array)

    print("Qator elementlari: ")
    array.forEach { print("$it ") }
    println()
    print("Variatsion qator : ")
    val sortedArray = sortArray(array)
    sortedArray.forEach { print("$it ") }
    println()
    print("Mode: ")
    modes.forEach { print("$it ") }
    println()
    println("Mediana: ${findMedian(array)}")
    println("Dispersiya: ${findDispersiya(array)}")
    println("Razmax: ${array.maxOrNull()!! - array.minOrNull()!!}")
    println("O'rtacha qiymat: ${findOrtacha(array)}")
    print("Rang values: ")
    rangValues.forEach { print("$it ") }
}
