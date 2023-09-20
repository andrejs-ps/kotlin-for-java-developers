package for_java_devs.m5_functions._5localfunctions

data class Client(val id: Int, val name: String, val email: String)

fun sendEmail(client: Client) {

    fun validateField(field: String?, fieldName: String) {
        if (field.isNullOrBlank()) {
            throw IllegalStateException(
                "Client with id ${client.id} has invalid details. '$fieldName' must not be empty, blank or null. " +
                        "Actual values was '$field'"
            )
        }
    }

    validateField(client.name, "Name")
    validateField(client.email, "Email")

}

private fun validateField(client: Client, field: String?, fieldName: String) {
    if (field.isNullOrBlank()) {
        throw IllegalStateException(
            "Client with id ${client.id} has invalid details. '$fieldName' must not be empty, blank or null. " +
                    "Actual values was '$field'"
        )
    }
}


