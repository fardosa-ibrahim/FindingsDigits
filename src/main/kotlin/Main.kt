fun main(args: Array<String>) {
    var line = "This website is aw3som3."
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val common = line[i]
        if (common == 'a' || common == 'e' || common == 'i'
            || common == 'o' || common == 'u') {
            ++vowels
        } else if (common in 'a'..'z') {
            ++consonants
        } else if (common in '0'..'9') {
            ++digits
        } else if (common == ' ') {
            ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White spaces: $spaces")
    another()
}
fun another() {
    var line = "This website is aw3som3."
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        when (ch) {
            'a', 'e', 'i', 'o', 'u' -> ++vowels
            in 'a'..'z' -> ++consonants
            in '0'..'9' -> ++digits
            ' ' -> ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White spaces: $spaces")
}