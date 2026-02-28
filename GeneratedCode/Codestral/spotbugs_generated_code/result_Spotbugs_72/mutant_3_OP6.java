class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}