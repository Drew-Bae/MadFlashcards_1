package entities

data class Flashcard(val term: String, val definition: String)

fun main(args: Array<String>) {
    val term1 = Flashcard("diegetic", "happen" +
            "ing within or being the created world of a story.")
    val term2 = Flashcard("holophrase","a word functioning as a phrase" +
            " or sentence, as the imperative Go!")
    val term3 = Flashcard("fantabulous","extremely fine or" +
            " desirable; excellent; wonderful.")
    val term4 = Flashcard("alembic","anything that transforms," +
            " purifies, or refines.")
    val term5 = Flashcard("torrential","falling in rushing, " +
            "violent, or abundant and unceasing streams.")
    val term6 = Flashcard("shibboleth","a common saying" +
            " or belief with little current meaning or truth.")
    val term7 = Flashcard("grouse","to grumble; complain.")
    val term8 = Flashcard("ad hockery","reliance on temporary" +
            " solutions rather than on consistent, long-term plans.")
    val term9 = Flashcard("flocculent","like a clump or tuft of wool.")
    val term10 = Flashcard("belly-wash","any barely drinkable " +
            "liquid or beverage, as inferior soda, beer, coffe, or soup.")
    println("The definition for ${term1.term} is: ${term1.definition}")
    println("The definition for ${term2.term} is: ${term2.definition}")
    println("The definition for ${term3.term} is: ${term3.definition}")
    println("The definition for ${term4.term} is: ${term4.definition}")
    println("The definition for ${term5.term} is: ${term5.definition}")
    println("The definition for ${term6.term} is: ${term6.definition}")
    println("The definition for ${term7.term} is: ${term7.definition}")
    println("The definition for ${term8.term} is: ${term8.definition}")
    println("The definition for ${term9.term} is: ${term9.definition}")
    println("The definition for ${term10.term} is: ${term10.definition}")
}