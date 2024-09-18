fun main() {
//    Vararg (Variable Argument)
//Selain named dan default argument, Kotlin juga memiliki vararg (variable argument). Dengan menggunakan kata kunci vararg, kita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
//
//Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen yang kita masukkan ketika fungsi tersebut dipanggil. Contoh dari penggunaan vararg adalah sebagai berikut.

    fun sumNumbers(vararg number: Int): Int {
        return number.sum()
    }

//    Bisa kita perhatikan pada contoh kode di atas bahwa kata kunci vararg ditempatkan sebelum nama parameter. Ketika ingin memanggil fungsi tersebut, kita bisa melampirkan beberapa argumen seperti berikut.

    val number = sumNumbers(10, 20, 30, 40)
    print(number)

//    Aturan pada Vararg Arguments
//Dalam penggunaannya, terdapat aturan yang perlu kita ketahui. Pertama, di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.

//    Selanjutnya, jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang ditandai dengan vararg sebaiknya berada pada posisi terakhir.
}