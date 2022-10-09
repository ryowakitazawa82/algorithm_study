/*
fibonacci数を再帰的に求めてみる
*/
fun main(args: Array<String>) {
    val num = 20
    for(i in 0..num) {
        print("${i}:${fibonacci(i)}\n")
    }
}

fun fibonacci(num: Int):Int {
    when(num) {
        0 -> return 0
        1 -> return 1
        else -> {
            return fibonacci(num - 1) + fibonacci(num - 2)
        }
    }
}
