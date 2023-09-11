package Lesson_2

fun main() {
    val heightInSm = 173
    val heightDouble = 173.5
    val heightFloat = heightInSm.toFloat()
    val heightString = heightInSm.toString()
    val heightInt = heightDouble.toInt()/100

    val number = 86
    val simvol = 't'

    val CharToInt = simvol.code
    println(CharToInt)

    val intToChart = number.toChar()
    println(intToChart)


    val height = heightFloat / 100

    println("Bu insonni bo'yini balandligi: $height m")
    println("Bu insonni bo'yini balandligi: $heightString m")
    println("Bu insonni bo'yini balandligi: $heightInt m")


}