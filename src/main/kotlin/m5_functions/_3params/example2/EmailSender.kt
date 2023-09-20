package for_java_devs.m5_functions._3params.example2

fun sendEmail(
    subject: String = "No subject",
    to: List<String>,
    cc: List<String> = emptyList(),
    bcc: List<String> = emptyList()
) {
    println("Sending email with subject: $subject")
    println("To: $to")
    println("Cc: $cc")
    println("Bcc: $bcc")
}

fun main() {

    sendEmail(
        to = listOf("joe@corp.com", "marie@corp.com")
    )


    sendEmail(
        subject = "This email could've been a meeting",
        to = listOf("joe@corp.com", "marie@corp.com"),
        cc = listOf("boss-boss@corp.com"),
    )


}
