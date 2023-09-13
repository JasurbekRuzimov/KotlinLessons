package Lesson_3

import kotlin.math.*

fun main() {

    val pi = PI
    val e = E
    val firstNumber = 4
    val secondNumber = 5

    println("Pi ni qiymati = $pi")
    println("e ni qiymati = $e")

    val result = Math.max(firstNumber, secondNumber)
    println("Ikki sondan kataasi - $result")


// pow() funksiyasi faqat double qiymatda ishlaydi , shuning uchun sonni oldin double ko'rinishga o'tkazib olishimiz kerak .toDouble funksiyasi blan
    val kv = pi.pow(2)
    println("Pi ni kvadrati shunga teng - $kv")

    val sqrt = sqrt(e)
    println("e ni kvadrat ildizdan chiqarib olgandagi qiymati - $sqrt")


    val a=3
    val b=4

    // hypot() metodi  faqat double va float tipida ishlaydi
    val c= hypot(a.toDouble(), b.toDouble())
    println("To'g'ri burchakli ucburchakning gipotenuzasi = $c ga teng ")

    // bu ham double tipida ishlaydi  xohlasangiz natijani \int tipiga o'tkazib  olishingiz mumkin
    val  logNumber:Double = 100.0
    val log = log10(logNumber)
    println("Logarifm 10 asosga ko'ra ${logNumber.toInt()} ni qiymati = $log")


    // bu ham  double va float tipida ishlaydi,  bunf=da logarifmni asosini o'zimiz belgilaynix, logbase bu logarifmni asosi hisolanadi
    val  logBase:Double = 3.0
    val logOther = log(logNumber, logBase)
    println("Logarifm ${logBase.toInt()} assga ko'ra ${logNumber.toInt()} ni qiymati = $logOther ")

    val number2 = -29
    val rsl= number2.sign
    println("Berilgan sonninng  manfiy yoki musbat ligini aniqlab beradi  -1 bo'lsa manfiy , 1 bolsa musbat :=  $rsl")

// ceil() funksiyasi  sonni tepaga yaxlitlaydi
    val num:Double = 9.1
    val ceil = ceil(num)
    println(" $num ni yaxlitlaganda $ceil ga teng bo'ladi")

// floor() funksiyasi  sonni pastga yaxlitlaydi
    val num1:Double = 9.1
    val floor = floor(num)
    println(" $num1 ni yaxlitlaganda $floor ga teng bo'ladi")

}
