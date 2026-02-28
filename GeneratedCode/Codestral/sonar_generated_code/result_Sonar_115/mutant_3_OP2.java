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
        // Bug: Duplicating the method call to requiredMethod()
        requiredMethod();
        //...
    }

    public void showBug() {
        mandatoryMethod();
    }
}