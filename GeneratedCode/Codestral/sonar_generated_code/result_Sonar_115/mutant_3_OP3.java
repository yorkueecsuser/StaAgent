class TransactionalBug {
    // Other methods...

    public void mandatoryMethod() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable under any circumstance, as getUnreachableCondition() always returns false
            System.out.println("Unreachable code executed");
        }

        requiredMethod();
        //...
    }

    // This method returns false, making the if statement unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    // Other methods...
}