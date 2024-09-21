fun main() {
//    Map
//Turunan yang ketiga adalah Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value.
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
//    String yang berada pada sebelah kiri dari kata kunci to adalah sebuah key, sedangkan yang di sebelah kanan merupakan value-nya. Lalu untuk mengakses nilai dari Map tersebut, kita bisa menggunakan key yang sudah dimasukkan. Misalnya, kita bisa menggunakan key “Jakarta” untuk mendapatkan value “Indonesia”:
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}