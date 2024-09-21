fun main() {
//    filter() dan filterNot()
//Mari kita mulai dari fungsi filter() dan filterNot() terlebih dahulu. Kedua fungsi tersebut akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan. Sesuai dengan namanya, untuk mem-filter atau menyaring suatu data dalam sebuah collection. Contohnya dapat Anda lihat pada kode berikut.
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

//    map()
//Fungsi yang akan sering dipakai berikutnya adalah map(). Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya. Kita ambil contoh dari numberList yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item sehingga Anda bisa menggunakan kode seperti berikut.
    val multipliedBy5 = numberList.map { it * 5 }
//    it pada kode di atas akan merepresentasikan masing-masing item pada numberList.

//    count()
//Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection. Kembali gunakan contoh numberList, kita akan menampilkan jumlah item yang ada di dalamnya.
    print(numberList.count())

//    Cukup sederhana, bukan? Di dalam fungsi count() kita juga bisa menambahkan sebuah parameter yang berisi sebuah kondisi. Sebagai contoh kali ini kita akan menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3.
    print(numberList.count { it % 3 == 0 })

//    find(), firstOrNull(), & lastOrNull()
//Selanjutnya adalah fungsi yang digunakan untuk mencari item pada sebuah collection. Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan, kita bisa menggunakan fungsi find(). Contoh, kita perlu mencari angka ganjil pertama dari numberList kodenya akan seperti berikut.
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

//    Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya, jika di dalam collection tidak ditemukan data yang sesuai, fungsi akan mengembalikan nilai null. Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian, jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().

//    first() & last()
//Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter. Namun, perlu diperhatikan jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception!

//    sum()
//Mungkin Anda sudah tahu fungsi ini. Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
    val total = numberList.sum()

//    sorted()
//sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending. Perhatikan kode di bawah ini.
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

//Namun, untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending().
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

//    Fold
//Langsung saja kita mulai dengan fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold(). Untuk contoh penggunaannya adalah sebagai berikut:
    val numbers = mutableListOf(1,2,3)
    val fold = numbers.fold(10) {current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

//    Selain itu, terdapat juga fungsi fold lainnya yaitu foldRight(). Berbeda dengan fungsi fold(), fungsi foldRight() akan melakukan proses iterasi dari indeks terakhir dan posisi dari argumen pada lambda expression nya pun berbeda, di mana argumen item berada pada posisi pertama dan argumen current berada pada posisi kedua. Contohnya seperti berikut:
    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

//    Take
//Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection. Pemanggilan fungsi take() sama halnya seperti fungsi drop() di mana kita perlu menentukan jumlah item yang akan disaring. Berikut contoh penggunaannya:
    val totalin = listOf(1, 2, 3, 4, 5, 6)
    val take = totalin.take(3)

    println(take)

//    Sequences
//Tiga (3) jenis collection yang sudah kita pelajari sebelumnya merupakan jenis collection yang menjalankan eager evaluation. Berbeda dengan itu, Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation. Jika eager evaluation mengevaluasi seluruh item yang ada pada collection [5], lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan [6]. Kita ambil contoh.. Misalnya Anda mempunyai collection dengan jumlah data 10 atau 100 , itu mungkin tidak akan memberi pengaruh besar terhadap performa program. Namun apa yang terjadi jika data yang ada pada collection mencapai ratusan ribu atau jutaan? Waktu proses pada sebuah program akan bertambah signifikan jika semua datanya harus dievaluasi.

//    Untuk menerapkan lazy atau vertical evaluation, kita perlu mengubah list menjadi Sequence. Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence().
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)
}