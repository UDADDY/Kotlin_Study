import java.lang.IllegalArgumentException

fun main() {
    val person = Person("HI")
    print(person.age)
}

class Person(
    // 주 생성자
    val name: String,
    var age: Int
) {
    // 생성자가 호출되는 시점
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 1)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}