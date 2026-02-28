// Placeholder interface for Transactional annotation
interface Transactional {
    enum Propagation { REQUIRED, MANDATORY }
}

class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    private boolean getCondition() {
        return false; // Method returns false to make the loop condition unreachable
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        requiredMethod();

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}