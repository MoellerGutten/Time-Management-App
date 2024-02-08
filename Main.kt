
fun parseInput(input : String): List<String> {
    val reg = Regex("(?=[+-])")
    val parsedInput: List<String> = input.split(reg)
    val newList: MutableList<String> = parsedInput.toMutableList()
    if (newList[0] == "") {
        newList.removeAt(0)
    }

    return newList
}

fun multivision(list : List<String>): List<String> {
    var result : Double = 0.0
    var mulIndex : List<Int> = listOf()

    list.forEachIndexed() { i, num ->
        num.forEach { char ->
            if (char == '*') {
                mulIndex += i
                println("I found a * at $mulIndex")
            }
        }

    }
    println(mulIndex)
    val reg = Regex("(?=[*])")
    var newList : List<String> = list.toString().removeSurrounding("[","]").split(reg)

    println(newList)
    mulIndex.forEach() {num ->
        if (newList[num+1][0] == '*') {
            newList[num+1].removePrefix(" *")
            println(newList[num+1])
            result += newList[num].toDouble() * newList[num+1].toDouble()
            newList.toMutableList().removeAt(num)
            newList.toMutableList().removeAt(num+1)
            newList.toMutableList().add(num, result.toString())
        }
    }
    println("Finished $newList")
    return newList
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


    multivision(parsedInput)

    parsedInput.forEachIndexed {i, token ->
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
    }
    println("AND THE RESULT ISSS: $result")

}
