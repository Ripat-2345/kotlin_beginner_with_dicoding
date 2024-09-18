fun main() {
//    Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya. Sementara itu, Break digunakan untuk menghentikan proses iterasi.
//
//Berikut adalah contoh proses iterasi pada kode di atas. Kita akan coba melewatkannya jika nilai yang dihasilkan adalah null.

    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

//    Pada kode di atas kita menggunakan kata kunci continue. Jika hasil evaluasi expression yang diberikan bernilai true, maka proses iterasi akan dilewatkan dan lanjut ke proses iterasi berikutnya.
//
//Berikut adalah contoh jika kita ingin menghentikan proses iterasi ketika nilai yang dihasilkan bernilai null.

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

//    Break dan Continue Labels
//Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label. Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @. Contoh dari sebuah label adalah foo@ atau bar@.
//
//Untuk melabeli sebuah expression, kita cukup menempatkan label di depannya. Contohnya seperti berikut:
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }

//    Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label. break akan menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil.
}