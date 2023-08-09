data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // ... (other code)

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

    companion object StudentProgress {
        var total: Int = 100
        var answered: Int = 2
        val progressText: String
            get() = "$answered of $total answered"
        val progressComment: String
            get() =
                if (answered > 1) {
                    "Congratulations"
                } else {
                    "Do more research"
                }
        var checking: String = ""
            set(value) {
                field = "Check it further"
            }
    }
}

enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun Quiz.StudentProgress.printProgressBar() {
    repeat(answered) { print("▓") }
    repeat(total - answered) { print("▒") }
    println()
    println(progressText)
}

fun main() {
    println("${Quiz.StudentProgress.answered} of ${Quiz.StudentProgress.total} answered.")
    println(Quiz.StudentProgress.progressText)
    Quiz.StudentProgress.printProgressBar() // Removed Quiz. before StudentProgress
    val quiz = Quiz() // Create an instance of Quiz
    quiz.printQuiz() // Call printQuiz on the instance
    println()
}
