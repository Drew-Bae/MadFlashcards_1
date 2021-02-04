package entities

data class FlashcardSet(val subject: String)

fun main(args: Array<String>) {
    val set1 = FlashcardSet("Math")
    val set2 = FlashcardSet("Science")
    val set3 = FlashcardSet("History")
    val set4 = FlashcardSet("PE")
    val set5 = FlashcardSet("Lunch")
    val set6 = FlashcardSet("Home-Ec")
    val set7 = FlashcardSet("Computer Science")
    val set8 = FlashcardSet("Video Game")
    val set9 = FlashcardSet("Boot Camp")
    val set10 = FlashcardSet("World Domination")
    println("This flashcard set is about: ${set1.subject}")
    println("This flashcard set is about: ${set2.subject}")
    println("This flashcard set is about: ${set3.subject}")
    println("This flashcard set is about: ${set4.subject}")
    println("This flashcard set is about: ${set5.subject}")
    println("This flashcard set is about: ${set6.subject}")
    println("This flashcard set is about: ${set7.subject}")
    println("This flashcard set is about: ${set8.subject}")
    println("This flashcard set is about: ${set9.subject}")
    println("This flashcard set is about: ${set10.subject}")
}