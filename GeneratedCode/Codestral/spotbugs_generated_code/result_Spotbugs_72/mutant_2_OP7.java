class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean conditionWhile = false; // Introducing a false condition for the while loop
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable block");
        }
        // The original bug is still present here
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }

    // A helper method to prevent using compile-time constants directly in the condition
    private boolean getCondition() {
        return false;
    }
}