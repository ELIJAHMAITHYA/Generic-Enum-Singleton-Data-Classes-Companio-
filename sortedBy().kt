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
val groupcookies = cookies.groupBy{
    it.hasFilling
}
val sortedcookie = cookies.sortedBy{
    it.price
}
var sort_by_name= cookies.sortedBy{
    it.name
}

fun main() {
    val hasfill= groupcookies[true] ?: listOf()
    val nofill= groupcookies[false] ?: listOf()
    hasfill.forEach{
        println("${it.name} : ${it.price}")
                }
    println()
    nofill.forEach{
     println("${it.name} - ${it.price}")   
    }
    val total_filledcookie = hasfill.fold(0.0){
        total, hasfill ->
        total + hasfill.price
    }
    
    val totalnofill= nofill.fold(0.0){
        total,nofill ->
        total+ nofill.price
    }
    println()
     println("The total price for filled cookies is: " + total_filledcookie)
    println("The total price for no filled cookies is: " + totalnofill)
    println()
 sortedcookie.forEach{
     println("${it.name} : ${it.price} ")
 }
    println()
    println("Sorted by name:")
    sort_by_name.forEach{
        println("${it.name} - ${it.price}")
    }
                }