class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}