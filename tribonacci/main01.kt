/*
0から50までのトリボナッチ数を出力してください。

トリボッチ数とは、次のように定義される数列です。

T(0) = 0
T(1) = 0
T(2) = 1
T(n) = T(n - 1) + T(n - 2) + T(n - 3)

たとえば、4番目のトリボッチ数は、次のように計算します。

T(4) = T(3) + T(2) + T(1) = 1 + 1 + 0 = 2

0: 0
1: 0
2: 1
3: 1
4: 2
5: 4
6: 7
7: 13
8: 24
9: 44
10: 81
11: 149
*/
fun main(args: Array<String>) {
    val num:Int
    for(i in 0..10) {
        print("${i}:${calc(i)}\n")
    }
}

fun calc(num : Int):Int {
    var first = 0
    var second = 1
    var third = 1
    return when (num) {
        0 -> 0
        1 -> first
        2 -> second
        3 -> third
        else -> {
            var current = first + second + third
            for (i in 4..num) {
                current = first + second + third
                first = second
                second = third
                third = current
            }
            current
        }
    }
}


