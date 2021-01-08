fun my4(vararg args: String) : String {
    return "Hello ${args.joinToString(separator = ",")}"
}

fun main() {
    val x5b = my4(args = arrayOf("Denis", "Anna", "Anton"))
    val x5a = my4("Denis", "Anna", "Anton")
    println(x5b)
}
