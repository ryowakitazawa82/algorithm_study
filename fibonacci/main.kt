/*
右のプログラムをベースにして、2のN乗を求めてください。Nは、0から10まで増えていきます。2の0乗は1になります。
ただし、Math.powメソッドは、使用しないでください。また、本チャプターで使った方法を参考にして、配列を用いて計算します。

期待する出力値
0: 1
1: 2
2: 4
3: 8
4: 16
5: 32
6: 64
7: 128
8: 256
9: 512
10: 1024
*/
fun main(args: Array<String>) {
    val num:Int
    for(i in 0..10) {
        print("${i}:${calc(i)}\n")
    }
}

fun calc(num : Int):Int {
    val numList = mutableListOf<Int>(1)
    for(i in 1..num ) {
        numList.add(2)
    }
    var result = 1
    return numList.reduce {
        tmp, value -> tmp * value
    }
}
