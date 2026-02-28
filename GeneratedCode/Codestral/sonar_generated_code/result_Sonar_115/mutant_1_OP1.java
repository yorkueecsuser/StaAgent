import java.util.Random;

// Placeholder interface for Transactional annotation
interface Transactional {
    enum Propagation { REQUIRED, MANDATORY }
}

class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        // BUG: Calling requiredMethod from same-class which is incompatible with MANDATORY propagation

        // Adding a dead store
        int deadStoreVariable = generateRandomInt();

        requiredMethod();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }

    // Helper method to generate a random integer
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}