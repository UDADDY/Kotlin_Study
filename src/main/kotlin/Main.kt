import java.lang.IllegalArgumentException

fun main() {
    val person = Person("HIfda", 30)
    print(person.isAdult)
    print(person.name)
}

class Person(
    // 주 생성자
    name: String = "HELLO!",
    var age: Int = 1,
) {
    // 생성자가 호출되는 시점
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 메소드형
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // property화
    val isAdult: Boolean
        // Custome Getter
        get() = this.age >= 20

    // field는 자기 자신 this와 같음 name을 언급할 때, getter를 이용하는데 get()이 getter이니 무한 루프 생김, field가 억제
    val name: String = name
        get() = field.uppercase()
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