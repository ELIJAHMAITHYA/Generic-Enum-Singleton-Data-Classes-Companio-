fun main() {
    println("Hello, world!")
    val boys: Array<String> = arrayOf("Sila", "Elijah", "Ben", "Ken", "Keith")
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val girl = arrayOf<String>("Faith", "Rose", "Mary", "Beth", "Shakira", "Maggie")
    val student= girl + boys
    val planets = rockPlanets + gasPlanets
    var i= 0
    var t= 0
    while (i< student.size){
      //  println(student[i])
        i++
    }
     println()
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    while (t < solarSystem.size){
       
        //println(solarSystem[t])
        t++
    }
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
for (planet in solarSystem) {
   // println(planet)
}
val solarsystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
solarsystem.add(0,"Pluto")
for (planet in solarsystem){
    println(planet)
}
println(solarsystem.contains("Pluto"))
print("Pluto" in solarsystem)
}
