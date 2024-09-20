package kotlin_oop

class Animal(){
    var name: String = "kucing"
    var weight: Double = 3.2
    var age: Int = 3
    var isMammal: Boolean = true

    fun eat(){
        println("$name makan!")
    }

    fun sleep(){
        println("$name tidur!")
    }
}

fun main() {
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()

// Mengubah Properti dari class dicodingCat
    dicodingCat.name = "Kucing Oren"
    dicodingCat.weight = 6.0
    dicodingCat.age = 3
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}
