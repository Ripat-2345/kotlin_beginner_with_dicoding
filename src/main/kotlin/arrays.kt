// tipe data array, array di kotlin berisikan kumpulan data dengan tipe yang sama
// tipe data array di kotlin direpresentasikan dengan kata kunci Array

fun main() {
//    Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size. Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:
//    Operasi array di kotlin
//    size = untuk mendapatkan panjang array
//    get(index) = mendapat data di posisi index
//    [index] = mendapat data di posisi index
//    set(index, value) = mengubah data di posisi index
//    [index] = value = mengubah data di posisi index
//    array tidak boleh null
    val names: Array<String> = arrayOf("Ripat", "Al", "Safar")
    println(names)

    names.set(0, "Kuro")
    names[1] = "Tan"
    println(names[0])
    println(names[1])

//    array boleh null
    val petNames: Array<String?> = arrayOfNulls(size = 2)
    petNames.set(0, "mochi")
    petNames[1] = "cniid"

}