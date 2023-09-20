package m6_oop.notcovered;

public class SealedClassDemo {

    sealed abstract class PaymentMethod permits CreditCard, BankTransfer {
        public abstract void makePayment(double amount);
    }

    final class CreditCard extends PaymentMethod {
        @Override
        public void makePayment(double amount) {
            // ...
        }
    }

    final class BankTransfer extends PaymentMethod {
        @Override
        public void makePayment(double amount) {
            // ...
        }
    }

}
