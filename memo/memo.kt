package memo

class memo {

    /* 1つの数字 */
    val imputNum = readLine()!!.toInt()

    /* 1行に複数の数字(リストとして受け取る) ex:[1, 2, 3] */
    val imputNum2 = readLine()!!.split(" ").map{it.toInt()}

    /* 複数行の1つの数字をリストとして受け取る */
    val imputNum3 = (0 until 3).map{readLine()!!.split(' ').map{it.toInt()}}.map{it[0]}

    /* 複数行の複数の数字をリストとして受け取る */
    val imputNum4 = (0 until 3).map{readLine()!!.split(' ').map{it.toInt()}}

    /* 複数行の複数の数字をリストとして受け取る（ 1行目の0番目のリストにn行ある事が入力されて、2行目以降に実際のデータがあるパターン） */
    val firstNum = readLine()!!.split(" ").map{it.toInt()}
    val afterFirstNum = (0 until firstNum[0]).map{readLine()!!.split(' ').map{it.toInt()}}
    //imputNumを算出するとき、firstNumは引かれている！！

    fun doWhile() {
        /* リストにaddしたり変数を更新したやつを使いたい時はforじゃなくて do-whileを使う */
        val result = mutableListOf<Int>()
        var score = 100
        var i = 0
        do {
            result.add(1)
            i++
            TODO()
        } while (i < 3)
    }
}