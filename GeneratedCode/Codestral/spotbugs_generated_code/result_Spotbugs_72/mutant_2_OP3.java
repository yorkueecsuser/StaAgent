class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean unreachableCondition = falseMethod(); // Unique method call returning false
        if (unreachableCondition) {
            System.out.println("This line should never execute.");
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }

    private boolean falseMethod() {
        return false;
    }
}