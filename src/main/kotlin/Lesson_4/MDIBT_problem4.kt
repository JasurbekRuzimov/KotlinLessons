package Lesson_4

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val my_list = intArrayOf(5, 8, 1, 6, 7, 1, 0, 1, 0, 6, 0, 4, 5, 5, 5, 5, 1, 9, 5, 0, 5, 6, 2, 8, 5)
    var sum = 0.0
    val average: Double

    for (i in my_list.indices) {
        sum += my_list[i]
    }

    average = sum / my_list.size
    println("O'rta arifmetik $average")

    // o'rtacha chetlanish
    var orta_chetlanish1 = 0.0
    val orta_chetlanish: Double
    var orta_chetlanish2 = 0.0
    var orta_chetlanish3 = 0.0
    var orta_chetlanish4 = 0.0

    for (i in my_list.indices) {
        orta_chetlanish1 += (my_list[i] - average).pow(2.0)
        orta_chetlanish3 += (my_list[i] - average).pow(3.0)
        orta_chetlanish4 += (my_list[i] - average).pow(4.0)
        orta_chetlanish2 += abs(my_list[i] - average)
    }

    orta_chetlanish = sqrt(orta_chetlanish1 / my_list.size)
    println("O'rta kvadratik chetlanish $orta_chetlanish")

    // variatsian kafisent
    val c: Double
    c = orta_chetlanish * my_list.size / orta_chetlanish2
    println("Variatsion koeffitsienti $c")

    // aniqlikning ko'rsatkichi
    var P: Double
    P = orta_chetlanish / (average * Math.sqrt(my_list.size.toDouble()))
    println("Aniqlik ko'rsatkichi $P")

    // Assimetrik ko'rsatkichi
    var A: Double
    A = orta_chetlanish3 / (my_list.size * orta_chetlanish)
    println("Assimetrik ko'rsatkichi $A")

    // Ekcess
    var E: Double
    E = orta_chetlanish4 / (my_list.size * Math.pow(orta_chetlanish, 4.0)) - 3
    println("Ekcess $E")

    // 0'rtacha arifmetik xatolik
    var m: Double
    m = orta_chetlanish / Math.sqrt(my_list.size.toDouble())
    println("O'rtacha arifmetik xatolik $m")

    // O'rtacha kvadratik chetlanish xatoligi
    var m_k: Double
    m_k = orta_chetlanish / Math.sqrt((2 * my_list.size).toDouble())
    println("O'rtacha kvadratik chetlanish xatoligi $m_k")

    // Variatsiya xatoligi
    var m_c: Double
    m_c = (c / (Math.sqrt((2 * my_list.size).toDouble()))) * Math.sqrt(1 + 2 * c / 100)
    println("Variatsiya xatoligi $m_c")

    // Aniqlik ko'rsatkichi xatoligi
    var m_p: Double
    m_p = P * Math.sqrt(1 / (2 * my_list.size) + Math.pow((P / 100), 2.0))
    println("Aniqlik ko'rsatkichi xatoligi $m_p")

    // Assimetriya xatoligi
    var m_a: Double
    m_a = Math.sqrt(orta_chetlanish / my_list.size)
    println("Assimetriya xatoligi $m_a")

    // Ekcess xatoligi
    println("Ekcess xatoligi " + 2 * m_a)

    // Normal taqsimot qonunini taqribiy kriteriyasi
    val b_a: Double
    var orta_chetlanish6 = 0.0

    for (i in 0 until my_list.size - 1) {
        orta_chetlanish6 += (my_list[i] - average).pow(4.0) / (my_list.size * orta_chetlanish.pow(4.0)) - 3
    }

    b_a = Math.sqrt(orta_chetlanish6 / ((my_list.size + 1) * (my_list.size + 3)))
    println("Normal taqsimot qonunini taqribiy kriteriyasi $b_a")

    val b_e: Double = sqrt(
        (24 * (my_list.size - 2) * (my_list.size - 3) * my_list.size) / ((my_list.size + 3) * (my_list.size + 5) * (my_list.size - 1).toDouble()
            .pow(2.0))
    )
    println("Normal taqsimot qonunini taqribiy kriteriyasi $b_e")
}
