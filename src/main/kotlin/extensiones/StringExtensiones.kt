package extensiones

fun String.negritaYVerde(): String {
    // Código ANSI para negrita: \u001b[1m
    // Código ANSI para color de texto verde: \u001b[32m
    // Código ANSI para restablecer el formato: \u001b[0m

    return "\u001b[1m\u001b[32m$this\u001b[0m"
}
