fun main() {
//    Pendeklarasian fungsi pada Kotlin diawali dengan kata kunci fun kemudian dilanjutkan dengan nama fungsi yang dikehendaki. Selanjutnya adalah parameter yang berada pada fungsi yang dideklarasikan. Awali dengan nama parameter dan ikuti dengan tipe parameter itu sendiri yang dipisahkan oleh karakter colon (:). Setiap parameter yang berada pada sebuah fungsi dipisahkan oleh karakter koma dan berada di dalam tanda kurung.

//    Setelah menentukan nama dan parameter, selanjutnya adalah menentukan tipe kembalian dari fungsi yang dibuat. Perlu diketahui fungsi pada Kotlin selalu mengembalikan nilai. Tipe kembalian adalah nilai yang akan dikembalikan ketika fungsi tersebut dipanggil.

    fun setUser(name: String, age: Int): String{
        return "Your name is $name, and you $age years old"
    }

//    Nilai yang akan dikembalikan diikuti oleh kata kunci return. Jika di dalam suatu fungsi hanya memiliki satu expression untuk menentukan nilai kembalian, maka fungsi tersebut bisa diubah menjadi expression body. Kita hanya perlu menambahkan tanda = dan menuliskannya seperti berikut:
// fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"

//    Named Argument
//Untuk mengatasi hal ini Kotlin menawarkan sebuah cara. Dengan ini, kita tak perlu lagi menghafal posisi dari sebuah parameter. Karena ketika sebuah fungsi dipanggil, kita bisa menentukan argumen dari parameter mana yang ingin dilampirkan dengan memanggil nama dari parameter tersebut. Misalnya kita mempunyai sebuah fungsi seperti berikut:

    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"
    }

//    Default Argument
//Tidak sampai di situ, Kotlin juga memungkinkan kita untuk menentukan nilai default dari sebuah parameter. Jika kita melewatkan argumen untuk dilampirkan, maka nilai default tersebut lah yang akan digunakan.

    fun getRealFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
        return "$first $middle $last"
    }
}