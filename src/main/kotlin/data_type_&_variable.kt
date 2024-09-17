fun main() {
    // Sebuah variabel akan membutuhkan kata kunci var atau val, identifier, type, serta initialization.
    // contoh : var identifier: Type = initialization
    var house: String = "My House!"

    // var atau val digunakan untuk mengontrol nilai dari sebuah variabel.
    // Dengan kata kunci var, kita bisa mengubah nilai yang sudah diinisialisasikan.
    house = "wife's House"
    println(house)

    // Ketika menggunakan kata kunci val, kita tidak bisa mengubah nilai yang sebelumnya sudah diinisialisasi.
    val name: String = "Shiro Tan"
    println(name)

    // Karena Kotlin mendukung type inference, kita diperbolehkan untuk tidak menuliskan tipe data secara eksplisit.
    var ability = "Fly"
    println(ability)
}