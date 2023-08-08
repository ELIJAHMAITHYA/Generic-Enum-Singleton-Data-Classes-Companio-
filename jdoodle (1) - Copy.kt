fun main() {
    println("Hello, world!")
    val student1= student <String> ("Sila Elijah",20, "Computer Science", Gender.MALE,true)
    println(student1.toString())
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")}
println("${schools.location}")
//Data class and Generics: Generic you can exclude the "data" keyword but it doesnt work with "to string" if ain't made data class
data class student <T> (
    val name :String,
    val age :Int,
    val course: T,
    val gender: Gender,
    val above18: Boolean,
)
//Enum class :is used to create types with a limited set of possible values.
enum class Gender{
    MALE,FEMALE,DONOTSAY
}
//Singleton Class: is a class that can only have a single instance.
object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}
//Companion Object :A companion object allows you to access its properties and methods from inside the class, if the object's properties and methods belong to that class, allowing for more concise syntax.
class schools{
    val student4= student <String> ("Sila Elijah",20, "Computer Science", Gender.MALE,true)
    companion object details{
        var name: String=" Dekut Cs It"
        var location :String= "Nyeri"
    }
}