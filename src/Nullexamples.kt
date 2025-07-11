fun main(args: Array<String>) {
    var secondaryPhoneNumber: String? = "+256 780306976"

    if (secondaryPhoneNumber != null){
        println(secondaryPhoneNumber.length)
    }
    else{
        println("The text is null")
    }

    // Elvis Operator

    val nickname: String? = null
    val displayName = nickname ?: "Valued Customer"

    println("Welcome, $displayName")

}