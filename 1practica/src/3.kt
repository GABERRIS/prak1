import kotlin.math.E
import java.text.DecimalFormat

fun main() {
    val df = DecimalFormat("#.#")
    val e = df.format(E)
    println("Число e: $e")
}