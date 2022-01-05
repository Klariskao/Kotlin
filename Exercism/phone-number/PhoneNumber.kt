class PhoneNumber(s: String) {

    private val clean = s.replace(Regex("[\\D]+"), "")
            .replace(Regex("^\\+?1"), "")

    init {
        require(Regex("^(?:[2-9]\\d{2}){2}\\d{4}\$").matches(clean))
    }

    val number: String? = clean
}
