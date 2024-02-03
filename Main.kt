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
    val input1: String = readln()

    print("Enter a second number: ")
    val input2: String = readln()

    val a = input1.toDouble()
    val b = input2.toDouble()

    println(addition(a, b))
    println(subtraction(a, b))
    println(multiplication(a, b))
    println(division(a, b))
}