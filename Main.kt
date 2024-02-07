
fun parseInput(input : String): List<String> {
    val reg = Regex("(?=[+-])")
    val parsedInput: List<String> = input.split(reg)
    val newList: MutableList<String> = parsedInput.toMutableList()
    if (newList[0] == "") {
        newList.removeAt(0)
    }

    return newList
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
    val parsedInput = parseInput(input)
    var result : Double = 0.0

    println(parsedInput)
    //println(parsedInput.size)
    var i : Int = 0
    parsedInput.forEach {token ->
        if (i == 0 && token[0] != '+' || i == 0 && token[0] != '-') {
            result += parsedInput[0].toDouble()
        }
        else {
            println(result)
            println("Im a dumb whoer $i, $token")
            if (token[0] == '+' && i < parsedInput.size) {
                print("Jeg plus $result med ")
                println(parsedInput[i])
                result += parsedInput[i].toDouble()
            }
            if (token[0] == '-' && i < parsedInput.size) {
                print("Jeg minus $result med ")
                println(parsedInput[i])
                result += parsedInput[i].toDouble()
            }
        }
        i += 1
    }
    println("AND THE RESULT ISSS: $result")

}
