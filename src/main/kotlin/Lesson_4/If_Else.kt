package Lesson_4

fun main() {
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
