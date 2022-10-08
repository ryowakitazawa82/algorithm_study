/*
fibonacci数を配列から求めてみる
*/
fun main(args: Array<String>) {
    val num = 50
    var fibo = Array(num + 1){it}

    fibo[0] = 0
    fibo[1] = 1

    for(i in 0..num) {
        if(i >= 2) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }
        print("${i}:${fibo[i]}\n")
    }
}
