package Lesson_4

fun main() {

    ifExample()

    // ifElse()
}


fun ifExample() {
    // A, B, C haqiqiy sonlari berilgan. Agar berilgan sonlar o`sish tartibida berilgan bo`lsa,
    // sonlarni ikkilantiring, aks holda sonlarni ishorasi o’zgartirilsin.
    // A, B, C ning qiymatlari ekranga chiqarilsin.
    println("Uchta son kiriting :")
    print("1-son: ")
    var a = readln().toInt()
    print("2-son: ")
    var b = readln().toInt()
    print("3-son: ")
    var c = readln().toInt()

    if (c > b && b > a) {
        a = 2 * a
        b = 2 * b
        c = 2 * c
        println("\n Sonlar o'sish tartibida ekan: \n Shartga ko'ra ularni ikkilantirgandagi qiymati: $a $b $c")
    } else {
        a = -a
        b = -b
        c = -c
        println("\n Sonlar o'sish tartibida emas ekan: \n Shartga ko'ra ularni ishorasi almashgan qiymati: $a  $b  $c")
    }

}

fun ifElse() {

    val age = 22
    val age2 = 22

    if (age > age2) {
        println("$age")
    } else if (age2 > age) {
        println(age2)
    } else
        println("Ikkalasi teng $age yosh")

    // readln() bu o'zgaruvchiga qiymatni  klaviaturadan kiritishga xizmat qiladi
    println("Biror bir sonni kiriting: ")
    val isTrue = readln().toInt()
    if (isTrue > 23)
        println(" $isTrue - Bu son 23 dan katta")
    else if (23 > isTrue)
        println(" $isTrue - Bu son 23 dan kichik")
    else
        println(" $isTrue - Bu son 23 ga teng")

}