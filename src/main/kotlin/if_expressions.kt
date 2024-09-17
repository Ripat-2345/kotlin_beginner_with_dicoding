fun main() {
    /*
    * If expression direpresentasikan dengan kata kunci if. If akan kita perlukan untuk menyelesaikan kasus di atas, dimana if akan digunakan untuk menguji suatu kondisi untuk menjalankan sebuah proses. If akan mengeksekusi sebuah statement atau expression jika hasil evaluasi dari expressions yang diberikan pada blok if bernilai true. Sebaliknya, jika bernilai false maka proses yang ditentukan akan dilewatkan.
    * */
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)
}