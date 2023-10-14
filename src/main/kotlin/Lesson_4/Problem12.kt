package Lesson_4

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val a = readInt("Birinchi sonni kiriting: ", scanner)
    val b = readInt("Ikkinchi sonni kiriting: ", scanner)

    if (a < b) println(a)
    else if (a > b) println(b)
    else println("Kiritilgan sonlar o'zaro teng!")
}

fun readInt(prompt: String, scanner: Scanner): Int {
    while (true) {
        print(prompt)
        val input = scanner.nextLine()

        try {
            return input.toInt()

        } catch (e: NumberFormatException) {
            println("Siz kiritgan malumotlarnigizda xatolik bor!")
            println("Ularni qayta teshkirib ko'ring!")
        }
    }
}