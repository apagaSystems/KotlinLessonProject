fun regexp() {
    val text = "The  is a character class used for a 456 character allowed in a word. " +
            "For the regular expression, which denotes a word, the 877 leading and trailing" +
            " word boundary metacharacters are implicit; i.e."

    val re = """\d{3}"""
//    println(text.matches(re))

//    val found = re.toRegex().find(text)
//    println(found?.value)
//    val found1 = re.toRegex().findAll(text).equals()
//    println(found1)





    val  match=Regex("\\d{3}").find(text)

    println(match.toString())
}