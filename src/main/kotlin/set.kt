fun main() {
//    Set
//Selanjutnya kita akan membahas objek turunan yang kedua, yaitu Set. Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection. Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

//    Kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set. Berikut contohnya.
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}