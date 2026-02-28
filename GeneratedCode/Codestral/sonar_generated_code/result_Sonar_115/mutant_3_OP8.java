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
        requiredMethod();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }

    // Mutant code added by Renaming mutation operator
    public void xMethod() {
        requiredMethod();
    }

    public void showMutant() {
        xMethod();
    }
}