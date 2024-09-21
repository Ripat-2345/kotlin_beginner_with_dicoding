fun main() {
//    List
//Yang pertama adalah List. Dengan List kita dapat menyimpan banyak data menjadi satu objek. Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya. Yang menarik, sebuah List tidak hanya bisa menyimpan data dengan tipe yang sama. Namun juga bisa berisi bermacam - macam tipe data seperti Int, String, Boolean atau yang lainnya. Cara penulisannya pun sangat mudah. Perhatikan saja beberapa contoh kode berikut.
    val numberList: List<Int> = listOf(1,2,3,4,5)
    val numberList2 = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

//    MutableList
//Sejauh ini kita baru belajar menginisialisasikan atau mengakses data dari sebuah List. Pastinya Anda bertanya, apakah bisa kita memanipulasi data pada List tersebut? Jawabannya tidak. Apa pasal? List tersebut bersifat immutable alias tidak bisa diubah. Namun jangan khawatir. Kotlin standard library juga menyediakan collection dengan tipe mutable. Artinya kita melakukan perubahan pada nilainya dengan cara seperti menambah, menghapus, atau mengganti nilai yang sudah ada. Caranya pun cukup mudah. Anda hanya perlu menggunakan fungsi mutableListOf seperti berikut:
    val anyList2 = mutableListOf('a', "Kotlin", 3, true)

    anyList2.add('d') // menambah item di akhir list
    anyList2.add(1, "love") // menambah item pada indeks ke-1
    anyList2[3] = false // mengubah nilai item pada indeks ke-3
    anyList2.removeAt(0) // menghapus item pada indeks ke-0



    val array = arrayOf("Kotlin", "Java")
    array[0] = "Dart" // no error
//    array.add("JavaScript") // error

    val list = listOf("Kotlin", "Java")
//    list[0] = "Dart" // error
//    list.add("JavaScript") //error

    val mutableList = mutableListOf("Kotlin", "Java")
    mutableList[0] = "Dart" // no error
    mutableList.add("JavaScript") // no error

    val arrayList = arrayListOf("Kotlin", "Java")
    arrayList[0] = "Dart" // no error
    arrayList.add("JavaScript") // no error

//    Seperti yang Anda lihat pada Array, lebarnya sudah tetap sehingga tidak dapat kita tambah atau hapus, sedangkan pada List, lebar dan nilai kontennya sudah tetap sehingga tidak dapat diubah-ubah. Jika Anda ingin mengubah isi konten maupun menambah/menghapus konten, gunakan MutableList atau ArrayList. ArrayList sebenarnya hanya abstraksi dari MutableList jadi keduanya memiliki sifat yang sama. 
}