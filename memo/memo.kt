package memo

class memo {

    /* 1つの数字 */
    val n = readLine()!!.toInt()

    /* 1行に複数の数字(リストとして受け取る) ex:[1, 2, 3] */
    val a = readLine()!!.split(" ").map{it.toInt()}

    /* 複数行の複数の数字をリストとして受け取る */
    val maze = (0 until 3).map{readLine()!!.split(' ').map{it.toInt()}}
}