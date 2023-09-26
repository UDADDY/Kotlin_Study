fun main() {
    val cat = Cat("누룽지")
    cat.move()

    val penguin = Penguin("황제")
    penguin.move()

}

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
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
) : Animal(species, 2) {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 걸어가")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}