class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        boolean unreachableCondition = getUnreachableCondition();
        while(unreachableCondition) {
            // Unreachable while loop inserted by Mutation Operator "Unreachable while loop"
            requiredMethod();
        }
        //...
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make the loop unreachable
    }

    public void showBug() {
        mandatoryMethod();
    }
}