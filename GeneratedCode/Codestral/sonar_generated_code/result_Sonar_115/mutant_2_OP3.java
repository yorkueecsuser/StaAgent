// Placeholder interface for Transactional annotation
interface Transactional {
    enum Propagation { REQUIRED, MANDATORY }
}

class TransactionalBug {

    private boolean unreachableCondition() {
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

        // Mutation: Inserting unreachable if branch
        if (unreachableCondition()) {
            System.out.println("This line will never be executed");
        }
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}