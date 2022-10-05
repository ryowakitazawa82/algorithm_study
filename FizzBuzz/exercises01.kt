/*
右のプログラムは、数値を1から100まで、コロン(:)をつけて出力します。
このプログラムを修正して、数値が3で割り切れる場合は「数値: Hoge」、
数値が5で割り切れる場合は「数値: Fuga」、
数値が3でも5でも割り切れる場合は「数値: HogeFuga」、
それ以外の場合は、そのまま数値を出力してください。

1
2
3: Hoge
4
5: Fuga
6: Hoge
7
...
 */

 fun main(args: Array<String>) {
    for(i in 1..100) {
        if(i % 3 == 0 && i % 5 == 0) {
            print("${i}: HogeFuga\n")
        } else if(i % 3 == 0 ){
             print("${i}: HogeFuga\n")
        } else if( i % 5 == 0) {
            print("${i}: Fuga\n")
        } else {
            print("${i}\n")
        }
    }
}
