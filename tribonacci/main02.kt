/*
※再帰的に呼び出して求める
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
    val num:Long = 50
    for(i in 0..num) {
        print("${i}:${fibonacci(i)}\n")
    }
}

fun fibonacci(num: Long):Long {
    return fib3(
        a = 0,
        b = 0,
        c = 1,
        d = num
        )
}

fun fib3(a:Long,b: Long,c:Long,d:Long):Long{
    if(d < 2) {
        return a;
    }
    return fib3(a + b + c, a, b, d - 1)
}
