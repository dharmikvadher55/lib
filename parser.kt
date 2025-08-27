// Example parser file (you can update anytime)
// This is plain Kotlin code text, not compiled here.

fun parse(sender: String, message: String): String {
    return "[$sender] ${message.replace("\n", " ")}"
}
