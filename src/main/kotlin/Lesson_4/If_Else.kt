package Lesson_4
//
//fun main() {
//
//    ifExample()
//
//    // ifElse()
//}
//
//
//fun ifExample() {
//    // A, B, C haqiqiy sonlari berilgan. Agar berilgan sonlar o`sish tartibida berilgan bo`lsa,
//    // sonlarni ikkilantiring, aks holda sonlarni ishorasi o’zgartirilsin.
//    // A, B, C ning qiymatlari ekranga chiqarilsin.
//
//    println("Uchta son kiriting :")
//
//    print("1-son: ")
//    var a = readln().toInt()
//
//    print("2-son: ")
//    var b = readln().toInt()
//
//    print("3-son: ")
//    var c = readln().toInt()
//
//
//    while ()
//

//
//}
//
//fun ifElse() {
//
//    val age = 22
//    val age2 = 22
//
//    if (age > age2) {
//        println("$age")
//    } else if (age2 > age) {
//        println(age2)
//    } else
//        println("Ikkalasi teng $age yosh")
//
//    // readln() bu o'zgaruvchiga qiymatni  klaviaturadan kiritishga xizmat qiladi
//    println("Biror bir sonni kiriting: ")
//    val isTrue = readln().toInt()
//    if (isTrue > 23)
//        println(" $isTrue - Bu son 23 dan katta")
//    else if (23 > isTrue)
//        println(" $isTrue - Bu son 23 dan kichik")
//    else
//        println(" $isTrue - Bu son 23 ga teng")
//
//}


//fun main() {
//    var A: Int
//    var B: Int
//    var C: Int
//
//    while (true) {
//        print("A ni kiriting: ")
//        try {
//            A = readLine()!!.toInt()
//            break // Raqam kiritildi, tsikldan chiqamiz
//        } catch (e: NumberFormatException) {
//            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
//        }
//    }
//
//    while (true) {
//        print("B ni kiriting: ")
//        try {
//            B = readLine()!!.toInt()
//            break // Raqam kiritildi, tsikldan chiqamiz
//        } catch (e: NumberFormatException) {
//            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
//        }
//    }
//
//    while (true) {
//        print("C ni kiriting: ")
//        try {
//            C = readLine()!!.toInt()
//            break // Raqam kiritildi, tsikldan chiqamiz
//        } catch (e: NumberFormatException) {
//            println("Xatolik: Raqam kiritishingiz kerak. Harf yoki so'z kiritmang.")
//        }
//    }
//
//    // Sonlarni o'sish tartibida tekshirish va ikkilantirish
//    var temp: Int
//    if (C > B && B > A) {
//        println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
//        A = 2 * A
//        B = 2 * B
//        C = 2 * C
//
//        println("\n Sonlar o'sish tartibida ekan: \n Shartga ko'ra ularni ikkilantirgandagi qiymati: \n" +
//                " A = $A  \n" +
//                " B = $B  \n" +
//                " C = $C")
//    } else {
//        println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
//        A = A*(-1)
//        B = B*(-1)
//        C = C*(-1)
//
//        println("\n Sonlar o'sish tartibida emas ekan: \n Shartga ko'ra ularni ishorasi almashgan qiymati: \n" +
//                " A = $A  \n" +
//                " B = $B  \n" +
//                " C = $C")
//    }
//}


//import java.io.File
//import kotlin.random.Random
//
//fun main() {
//    val random = Random(System.currentTimeMillis()) // Random objekti
//    val outputFile = File("test_cases.txt") // Fayl nomi va yo'l
//
//    // Faylni yaratish
//    outputFile.createNewFile()
//
//    // Faylga yozish uchun PrintWriter obyekti
//    val writer = outputFile.bufferedWriter()
//
//    // 1000 ta random test case yaratish va faylga yozish
//    for (i in 1..1000) {
//        val A = random.nextInt(1, 100)
//        val B = random.nextInt(1, 100)
//        val C = random.nextInt(1, 100)
//
//        writer.write("Test Case $i:\n")
//        writer.write("A = $A\n")
//        writer.write("B = $B\n")
//        writer.write("C = $C\n\n")
//    }
//
//    // Faylni yopish
//    writer.close()
//
//    println("Test case-lar faylga yozildi: ${outputFile.absolutePath}")
//}


import java.io.File
import kotlin.random.Random

class TestCasesGenerator(private val numberOfTestCases: Int, private val fileName: String) {
    init {
        generateTestCases()
    }

    private fun generateTestCases() {
        val random = Random(System.currentTimeMillis())
        val outputFile = File(fileName)

        outputFile.createNewFile()
        val writer = outputFile.bufferedWriter()

        for (i in 1..numberOfTestCases) {
            var A = random.nextInt(-1, 100)
            var B = random.nextInt(-1, 100)
            var C = random.nextInt(-1, 100)

            var temp: Int
            if (C > B && B > A) {
                println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
                A = 2 * A
                B = 2 * B
                C = 2 * C

                println(
                    "\n Sonlar o'sish tartibida ekan: \n Shartga ko'ra ularni ikkilantirgandagi qiymati: \n" +
                            " A = $A  \n" +
                            " B = $B  \n" +
                            " C = $C"
                )
            } else {
                println("\n Kiritilgan Sonlar qiymati: \n A = $A  \n B = $B  \n C = $C")
                A = A * (-1)
                B = B * (-1)
                C = C * (-1)

                println(
                    "\n Sonlar o'sish tartibida emas ekan: \n Shartga ko'ra ularni ishorasi almashgan qiymati: \n" +
                            " A = $A  \n" +
                            " B = $B  \n" +
                            " C = $C"
                )
            }


            writer.write("Test Case $i:\n")
            writer.write("A = $A\n")
            writer.write("B = $B\n")
            writer.write("C = $C\n\n")


        }

        writer.close()

        println("$numberOfTestCases ta test case faylga yozildi: ${outputFile.absolutePath}")
    }
}

fun main() {
    val numberOfTestCases = 1000
    val fileName = "test_cases.txt"
    TestCasesGenerator(numberOfTestCases, fileName)
}
