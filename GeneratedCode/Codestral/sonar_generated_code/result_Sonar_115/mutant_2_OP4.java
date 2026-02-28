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
        requiredMethod();
        // Added unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Alternative code
            //...
        }
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}