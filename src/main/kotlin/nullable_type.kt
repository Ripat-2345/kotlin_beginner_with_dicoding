fun main() {
//    val text: String = null // compile time error

    var text: String? = null
//    cara kita mengakses atau mengelola nilai dari objek yang ditandai sebagai nullable? Cara mudahnya, periksa objek tersebut bernilai null atau tidak menggunakan if.
    text = "malika"
    if(text != null){ // smart cast
        print(text.length) // it works now!
    }

//    Selain itu, Anda juga bisa menggunakan is atau !is untuk memastikan sebuah variabel. Compiler akan memastikan tipe data dari variabel tersebut. Contohnya sebagai berikut.
    var obj: Any = "Dicoding"

    if(obj is String){
        // tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }

//    bagaimana menangani objek nullable dengan cara yang lebih mudah, yaitu menggunakan Safe Calls dan Elvis Operator.

//    Safe calls operator (?.)
//Yang pertama akan kita pelajari adalah Safe Calls. Seperti namanya, safe call akan menjamin kode yang kita tulis aman dari NullPointerException. Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable seperti berikut.

    val name: String? = null
    name?.length

//    Elvis Operator (condition ? then : else)
//    Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.

    val age: String? = null
    val trueAge = age?.length ?: 7

//    Kode di atas sebenarnya sama seperti ketika kita menggunakan if/else berikut.

    val realAge = if(age != null) age.length else 7

//     Perhatikan penggunaan operator non-null assertion (!!), misalnya seperti berikut.
//    Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable.
    val dialog: String? = null
    val testDialog = dialog!!.length // ready to go!
}