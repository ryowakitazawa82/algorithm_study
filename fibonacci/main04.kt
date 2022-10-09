/*
再起関数を改良したバージョン
*/
fun main(args: Array<String>) {
    val num:Long = 50
    for(i in 0..num) {
        print("${i}:${fibonacci(i)}\n")
    }
}

fun fibonacci(num: Long):Long {
    return fib2(0, 1, num)
}

fun fib2(a:Long,b: Long,c:Long):Long{
    if(c < 1) {
        return a;
    }
    return fib2(a + b, a, c - 1)
}
