package Lesson_4

fun natija(a: Int, b: Int, c: Int): Int {

    return if (a < b || b < c) {
       a
    } else {
       b
    }
}

fun testNatija() {
    assert(natija(3, 2, 4) == 2)
    assert(natija(2, 4, 6) == 2)
    assert(natija(10, 10, 10) == 10)
    println("Testdan o'tdi!!!")

}

fun main() {
    testNatija()
}
