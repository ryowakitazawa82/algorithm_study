/**
 * kotlinでも同じ問題解いてみる
 */
fun main(args: Array<String>) {
    // Your code here!
    // var output = ""
    for(i in 1..30) {
        if(i % 3 == 0 && i % 5 == 0) {
            print("${i}FizzBuzz\n")
        } else if(i % 3 == 0) {
           print("${i}:Fizz\n")
        } else if(i % 5 == 0) {
            print("${i}:Buzz\n")
        } else {
         print("${i}\n")
        }
     }
}
