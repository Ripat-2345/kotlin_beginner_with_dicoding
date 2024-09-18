fun main() {
//    While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu. Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.
    var counter = 1
    while (counter <= 10){
        println("counting $counter")
        counter++
    }

//    Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal. Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
    var counterDoWhile = 1
    do {
        println("counting with do-while $counterDoWhile")
        counterDoWhile++
    }while (counterDoWhile <= 5)
}