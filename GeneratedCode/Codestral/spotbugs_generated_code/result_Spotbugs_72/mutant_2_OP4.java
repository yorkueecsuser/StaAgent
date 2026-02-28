class UnrelatedTypesComparison {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Object obj, String str) {
        if (getFalseCondition()) { // Mutant: Unreachable if-else statement
            System.out.println("This code block will never execute.");
        } else {
            // Original code
            return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        }
    }
}