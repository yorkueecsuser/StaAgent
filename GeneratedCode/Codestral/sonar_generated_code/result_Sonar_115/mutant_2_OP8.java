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
        // BUG: Calling requiredMethod from same-class which is incompatible with MANDATORY propagation
        // Mutated code: Renaming the method to'reqMethod'
        reqMethod();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }

    // Added mutated code: Renaming the method back to'requiredMethod'
    public void reqMethod() {
        requiredMethod();
    }
}