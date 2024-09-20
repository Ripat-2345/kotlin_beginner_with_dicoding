fun main() {
//    Lateinit
//Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda. Berikut ini contohnya.
    lateinit var name: String
    name = "Dicoding Miaw"

//    Lazy property
//Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi. Berikut ini contoh kodenya.
    val myName: String by lazy {
        "Dicoding Aja"
    }
}