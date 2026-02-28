class TransactionalBug {

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        // BUG: Calling requiredMethod from the same-class which is incompatible with MANDATORY propagation
        requiredMethod();

        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        } else {
            // This block will not be executed
        }

        //...
    }

    // Method to get the condition for the unreachable branch
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        mandatoryMethod();
    }
}