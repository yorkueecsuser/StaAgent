interface Transactional {
    enum Propagation { REQUIRED, MANDATORY }
}

class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        // Unreachable for loop mutation operator applied here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as conditionFor is always false
        }
        //...
    }

    private boolean getCondition() {
        // This method always returns false to ensure the loop is unreachable
        return false;
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        requiredMethod();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}