class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    var price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
class student (
    var name: String,
    var age: Int,
    var course: String
)
var details = listOf(
    student (
        name= "Sila",
        age = 19,
        course = "Comp Sci"
    ),
    student (
        name= "Ben",
        age = 20,
        course = "EEE"
    ),
    student (
        name= "Keith",
        age = 32,
        course = "Hospitallity"
    ),
    student (
        name= "Kelvin",
        age = 21,
        course = "BBIT"
    )


)

fun main() {
    println(cookies.size)
    cookies.forEach{
        it.price = it.price * 2
        println("${it.name} : ${it.price}")
    }
    details.forEach{
        println("${it.name} : ${it.age -10 }")

    }

}