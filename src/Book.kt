import java.util.*

const val maxBooks = 10
var booksBorrowed = 1



class Book(val title: String, val author: String, val year: Int, var pages: Int) {
    companion object {
        const val BASE_URL = "http://books.com"
    }
    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }
    fun getAllInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
    fun canBorrow(): Boolean {
        return booksBorrowed < maxBooks
    }

    fun printUrl() {
        println("${BASE_URL}/${title}.html")
    }
}

fun Book.weight(): Double { return pages * 1.5 }// grams
fun Book.tornPages(tp: Int) = if (pages >= tp) pages -= tp else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun main(args: Array<String>) {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "The Tempest")
    val library = mapOf("William Shakespeare" to allBooks)
    println(library.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf<String, String>("Dracula" to "Bram Stoker")
    moreBooks.getOrPut("Moby Dick") { "Herman Melville" }
    println(moreBooks)
}

