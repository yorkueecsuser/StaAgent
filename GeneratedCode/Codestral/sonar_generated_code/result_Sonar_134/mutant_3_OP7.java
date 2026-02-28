class UnnecessaryBoxingUnboxing {
    //...

    public void func() {
        //...

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
            // Added for mutation testing
        }

        examinePrimitiveInt(boxedInt.intValue());
        //...
    }

    //...

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}