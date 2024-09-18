fun main() {
//    Range
//    Seperti yang disampaikan sebelumnya, Range merupakan salah satu tipe yang unik pada kotlin. Kita dapat menentukan nilai awal dan nilai akhir pada Range. Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().
    val rangeInt = 1..10
    val rangeIntWithStep = 1 .. 10 step 2
    val rangeIntRangeTo = 1.rangeTo(10)
    val downIntDownTo = 10.downTo(1)
    val charRange = 'A'.rangeTo('H')
}