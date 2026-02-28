class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)

        // Mutated code: Unreachable while loop
        boolean conditionWhile = false; // always false to make the loop unreachable
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }
    }
}