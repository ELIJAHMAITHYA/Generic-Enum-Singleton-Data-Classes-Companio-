fun main() {
    println("Hello, world!")
    println("${Quiz.answered} of ${Quiz.total} answered.")
//println("${quiz1.toString()}")
}
data class  Question <T> (
    val question: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    EASY ,MEDIUM, HARD
}

class Quiz{
    var quiz1= Question <String> (" Is Nairobi a good place"," Yes It is", Difficulty.EASY)
    var quiz2= Question <Boolean> ("Is Kenya in Ecowas",true,Difficulty.MEDIUM,)
    var quiz3= Question <Int> ("How old are you",20,Difficulty.HARD) 
   companion object studentProgress {
        var total: Int= 10
        var answered :Int = 3
    }
}
