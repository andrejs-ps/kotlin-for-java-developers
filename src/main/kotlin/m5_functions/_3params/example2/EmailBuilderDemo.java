package m5_functions._3params.example2;

import java.util.ArrayList;
import java.util.List;

public class EmailBuilderDemo {

    static class EmailBuilder {
        private String subject = "No subject";
        private List<String> to = new ArrayList<>();
        private List<String> cc = new ArrayList<>();
        private List<String> bcc = new ArrayList<>();

        public EmailBuilder to(String recipient) {
            to.add(recipient);
            return this;
        }

        public EmailBuilder cc(String recipient) {
            cc.add(recipient);
            return this;
        }

        public EmailBuilder bcc(String recipient) {
            bcc.add(recipient);
            return this;
        }

        public EmailBuilder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public void send() {
            System.out.printf("Sending email with subject: %s%n", subject);
            System.out.printf("To: %s%n", to);
            System.out.printf("Cc: %s%n", cc);
            System.out.printf("Bcc: %s%n", bcc);
        }
    }


    public static void main(String[] args) {
        EmailBuilder builder = new EmailBuilder();
        builder.to("user1@example.com")
                .cc("user2@example.com")
                .bcc("boss-boss@corp.com")
                .withSubject("Important update")
                .send();
    }
}


