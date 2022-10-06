/**
 * グレゴリオ暦の閏年判定 - 乱数版
 * kotlinでかく
 */
fun main(args: Array<String>) {
    val range = (1..3000)
    val seireki = range.random()
    if(seireki % 400 == 0) {
        print("${seireki} leap year")
    } else if(seireki % 100 == 0) {
        print("${seireki}")
    } else if (seireki % 4 == 0) {
        print("${seireki} leap year")
    } else {
        print("${seireki}")
    }
}
