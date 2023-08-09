data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 100
        var answered: Int = 2
        val progressText: String
        get() = "$answered of $total answered"
        val progressComment: String
        get()= 
        if (answered > 1){
            " Cogratulations"
        }
        else {
            "Do more research"
        }
        var checking: String=""
        set (vaue){
            field= "Check it further"
        }

    }
}

enum class Difficulty {
    EASY, MEDIUM, HARD
}
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
fun main() {
    println("${Quiz.StudentProgress.answered} of ${Quiz.StudentProgress.total} answered.")
    println(Quiz.StudentProgress.progressText)
    println(Quiz.StudentProgress.printProgressBar())
}
