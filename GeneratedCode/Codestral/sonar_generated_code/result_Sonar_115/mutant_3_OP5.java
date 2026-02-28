class TransactionalBug {
    private boolean getFalse() {
        return false;
    }

    public void requiredMethod() {
        // This method requires a transaction or creates a new one
        //...
    }

    public void mandatoryMethod() {
        // This method requires an existing transaction
        // BUG: Calling requiredMethod from same-class which is incompatible with MANDATORY propagation
        requiredMethod();

        // Mutated Code: Adding an unreachable switch statement
        boolean condition = getFalse();
        if (condition) {
            int value = 1; // Value that will never be matched
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This line should never execute");
                    break;
            }
        }
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}