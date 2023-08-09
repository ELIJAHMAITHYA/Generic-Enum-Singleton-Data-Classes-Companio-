fun main() {
    println("Hello, world")

    val solarSystem = mutableSetOf("Mercury", "Venus", "Mars","Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    for(planet in solarSystem){
        println(planet)

    }
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println("Pluto" in solarSystem)
    println(solarSystem.contains("Mars"))
    val solarSystems = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    val people= mutableMapOf(
        "Sila" to 45,
        "Elijah" to 35,
        "Cathy" to 50,
        "Kevokl" to 56,
    )
    for (person in people ){
        println(person)
        println(people.contains("Sila"))
    }
    people["Maithya"]= 67
    println(people.size)
    println(solarSystems.size)
    println(solarSystems.get("Theia"))

}