import io.javalin.Javalin
import model.Person

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)
    app.get("/person/:id") {
        var person = Person(it.pathParam("id").toInt(), "Fred", 39)
        it.contentType("application/json")
        it.json(person)
    }
}