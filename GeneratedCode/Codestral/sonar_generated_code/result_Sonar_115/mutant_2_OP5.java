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

        // Added an unreachable switch statement
        int value = getFalseValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        //...
    }

    private boolean getFalseValue() {
        return false;
    }

    public void showBug() {
        mandatoryMethod();
    }
}