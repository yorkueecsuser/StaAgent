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

        // Mutation: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("This is unreachable code");
        }

        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}