package m6_oop.notcovered


sealed class PaymentMethod {
    abstract fun makePayment(amount: Double)
}

// subclasses may appear only within the same module/package
class CreditCard : PaymentMethod() {
    override fun makePayment(amount: Double) {
        // ...
    }
}

class BankTransfer : PaymentMethod() {
    override fun makePayment(amount: Double) {
        // ...
    }
}
