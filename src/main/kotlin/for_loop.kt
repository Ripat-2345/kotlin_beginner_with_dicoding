fun main() {
//    For Loop
//    Sama seperti While dan Do While, For merupakan konsep perulangan pada blok yang sama selama hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai true. For dapat digunakan pada Ranges, Collections, Arrays dan apa pun yang menyediakan iterator. Contoh dari For loop sendiri adalah sebagai berikut.

    val range = 1..5
    for (i in range){
        println("Range value : $i")
    }

//    Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada ranges dengan memanfaatkan fungsi withIndex() seperti berikut.
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

//    Kita menggunakan kata kunci for untuk memulai proses perulangan. Untuk tujuan yang sama, kita juga bisa memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach. Contohnya seperti berikut.
    ranges.forEach { value ->
        println("value is $value!")
    }
}