import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    val b = sc.nextInt()
    //val (a, b) = readln().split(" ").map { it.toInt() }
    println(calc(a,b))

    val res = if(a>b) a else b
    val res2 = when{
        a>b -> a
        else -> b
    }
    when(a) {
        1,2,3 -> { a++; println(a)}
        else -> println("Else")
    }
    val numbers = 1..10 // [1,10]
    for(i in numbers) {
     //   println(i)
    }
    println(numbers.javaClass.name) // Range

    val names: Array<String> = arrayOf("sdfsd","asfsdf","sdfsdf")
    names[0]

    for(i in 6 downTo 0 step 2) {
        print(i)
    }
    for(i in names.indices) {
        println(names[i])
    }

}

fun calc(a: Int, b: Int) = a+b
fun mult(a: Int, b: Int) {
    println("a=${a+calc(2,3)},b=${b+1}")
}
