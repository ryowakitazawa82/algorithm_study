/**
 * 改良してみる
 */
fun main(args: Array<String>) {
    var output:String = ""//kotlinは初期化が必須!!!!!
    for(i in 1..30) {
        if(i % 3 == 0) {
            output = "Fizz"
        }
        if(i % 5 == 0) {
            output = output + "Buzz"
        }
        val result = "${i}:${output}\n"
        print(result)
    }
}

