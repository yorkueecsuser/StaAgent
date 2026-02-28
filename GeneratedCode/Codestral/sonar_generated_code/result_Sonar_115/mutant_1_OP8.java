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
        // MUTANT CODE: Renaming requiredMethod to r
        this.r();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }

    // Adding a new method named r for the mutant code
    public void r() {
        requiredMethod();
    }
}