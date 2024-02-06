
fun parseInput(input : String): List<String> {
    val reg = Regex("(?=[+-])")
    val parsedInput: List<String> = input.split(reg)
    var newList: MutableList<String> = parsedInput.toMutableList()
    newList.removeAt(0)

    return newList
}

fun findOperators(listToCheck : MutableList<String>): MutableList<String> {
    println(listToCheck)

    return listToCheck
}

fun addition(a: Double, b: Double): Double {
    return a + b
}

fun subtraction(a: Double, b: Double): Double {
    return a - b
}

fun multiplication(a: Double, b: Double): Double {
    return a * b
}

fun division(a: Double, b: Double): Double {
    return String.format("%.3f", (a / b)).toDouble()
}

fun main() {
    print("Enter a number: ")
    val input: String = readln()
    val result = parseInput(input)

    println(result)


    if (result[1][0] == '+') {
        println(addition(result[0].toDouble(), result[1].toDouble()))
    }
    if (result[1][0] == '-') {
        println(subtraction(result[0].take(1).toDouble(), result[1].take(1).toDouble()))
    }

    //val a = input1.toDouble()
    //val b = input2.toDouble()

    //println(addition(a, b))
    //println(subtraction(a, b))
    //println(multiplication(a, b))
    //println(division(a, b))
}