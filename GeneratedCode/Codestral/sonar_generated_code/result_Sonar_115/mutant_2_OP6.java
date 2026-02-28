class TransactionalBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void mandatoryMethod() {
        // Unreachable For Loop Mutant
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This is an unreachable for loop.");
        }

        requiredMethod();
        //...
    }

    // The rest of the class remains the same...
}