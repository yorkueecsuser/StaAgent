import java.util.Random;

class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        // BUG: Calling requiredMethod from same-class which is incompatible with MANDATORY propagation
        requiredMethod();

        // Dead Store Mutation: Adding an unused integer variable
        int aqzxcvdt = new Random().nextInt(100);
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}