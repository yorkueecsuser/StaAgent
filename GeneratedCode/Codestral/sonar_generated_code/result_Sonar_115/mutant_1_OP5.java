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
        requiredMethod();
        // Inserting an unreachable switch statement
        int value = getValue();
        switch(value) {
            case 2:  // The case value is intentionally mismatched to make the switch unreachable
                System.out.println("This line will never be executed");
                break;
        }
        //...
    }

    private int getValue() {
        return 1;  // This method always returns a value that will not match the case in the switch statement
    }

    public void showBug() {
        mandatoryMethod();
    }
}