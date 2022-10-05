fun main(args: Array<String>) {
    // Your code here!
    val output = ""
    for(i in 1..30) {
        if(i % 3 == 0 && i % 5 == 0) {
            val output = "${i}FizzBuzz"
            } else if(i % 3 == 0) {
                val output = "${i}Fizz"
            } else if(i % 5 == 0) {
               val  output = "${i}Buzz"
            } else {
            val output = "${i}"
            }
            println(output)
        }
}
