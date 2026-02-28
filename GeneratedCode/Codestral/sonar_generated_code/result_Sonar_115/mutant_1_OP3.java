import java.lang.*;

// Placeholder interface for Transactional annotation
interface Transactional {
    enum Propagation { REQUIRED, MANDATORY }
}

class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        requiredMethod();

        // Unreachable if statement mutant
        if (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}