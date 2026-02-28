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
        // Adding unreachable while loop
        boolean condition = false;
        while (getCondition()) { // Method to always return false
            // This block of code is unreachable
        }
        requiredMethod();
        //...
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        mandatoryMethod();
    }
}