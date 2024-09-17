fun main() {
    val age: Int = 200
    println(age)

    // floating point number
    val sample: Float = 10.10F
    val sampleDouble: Double = 40022.123
    println(sample)
    println(sampleDouble)

    // literals
    val decimalLiteral: Int = 100
    val hexadecimalLiteral: Int = 0xff
    val binaryLiteral: Int = 0b0101
    println(binaryLiteral)

    // underscore in number (mempermudah membaca angka)
    val ageUnderScore: Byte = 3_0
    val distance: Short = 1_7_0
    val price: Long = 90_000_000_000L

    // conversion data type in kotlin
    // jika nilai melebihi bit konversi maka akan overflow contoh: Long 9M to Int 9M maka akan terjadi Int overflow
    val number: Long = 90_000_000_000L
    val byte: Byte = number.toByte()
    val short: Short = number.toShort()
    val int: Int = number.toInt()
    val long: Long = number.toLong()
    val float: Float = number.toFloat()
    val double: Double = number.toDouble()
}