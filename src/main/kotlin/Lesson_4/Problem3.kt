package Lesson_4

fun main() {
    var A: Int
    var B: Int
    var C: Int

    while (true) {
        print("A ni kiriting: ")
        try {
            A = readLine()!!.toInt()
            break // Raqam kiritildi, tsikldan chiqamiz
        } catch (e: NumberFormatException) {
            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
        }
    }

    while (true) {
        print("B ni kiriting: ")
        try {
            B = readLine()!!.toInt()
            break // Raqam kiritildi, tsikldan chiqamiz
        } catch (e: NumberFormatException) {
            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
        }
    }

    while (true) {
        print("C ni kiriting: ")
        try {
            C = readLine()!!.toInt()
            break // Raqam kiritildi, tsikldan chiqamiz
        } catch (e: NumberFormatException) {
            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
        }
    }

    // Sonlarni o'sish tartibida tekshirish va ikkilantirish
    var temp: Int
    if (C > B && B > A) {
        println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
        A = 2 * A
        B = 2 * B
        C = 2 * C

        println("\n Sonlar o'sish tartibida ekan: \n Shartga ko'ra ularni ikkilantirgandagi qiymati: \n" +
                " A = $A  \n" +
                " B = $B  \n" +
                " C = $C")
    } else {
        println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
        A = A*(-1)
        B = B*(-1)
        C = C*(-1)

        println("\n Sonlar o'sish tartibida emas ekan: \n Shartga ko'ra ularni ishorasi almashgan qiymati: \n" +
                " A = $A  \n" +
                " B = $B  \n" +
                " C = $C")
    }
    assert(A <= B && B <= C) { "Numbers are not in ascending order!" }
}
