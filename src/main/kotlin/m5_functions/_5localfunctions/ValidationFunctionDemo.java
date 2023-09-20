package m5_functions._5localfunctions;

import java.util.Objects;

public class ValidationFunctionDemo {

    record Client(int id, String name, String email) {
    }


    static void sendEmail(Client client) {
        Objects.requireNonNull(client);

        if (client.name == null || client.name.isBlank()) {
            throw new IllegalStateException(
                    String.format("Client with id %s has invalid details, %s must not be empty, blank or null", client.id, client.name)
            );
        }

        if (client.email == null || client.email.isBlank()) {
            throw new IllegalStateException(
                    String.format("Client with id %s has invalid details, %s must not be empty, blank or null", client.id, client.email)
            );
        }

        // send email
    }


    static void sendEmail2(Client client) {
        Objects.requireNonNull(client);

        validateField(client, client.name, "name");

        validateField(client, client.email, "email");

        // send email
    }

    private static void validateField(Client client, String field, String fieldName) {
        if (field == null || field.isBlank()) {
            throw new IllegalStateException(
                    String.format("Client with id %s has invalid details. '%s' must not be empty, blank or null. " +
                            "Actual value was '%s'", client.id, fieldName, field)
            );
        }
    }
}
