fun main() {
    val penguin = Penguin("황제")
    penguin.move()
    penguin.act()

}

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}

interface Swimable {

    // default 키워드 없이 메소드 구현 가능
    fun act() {
        println("어푸 어푸")
    }
}

interface Flyable {

    // default 키워드 없이 메소드 구현 가능
    fun act() {
        println("파닥 파닥")
    }
}

class Cat(
    species: String
) : Animal(species, 4) { // :가 자바의 extends, Animal(species,4)가 상위 클래스 생성자 호출
    override fun move() {
        println("고양이가 걸어가")
    }
}

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 걸어가")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}