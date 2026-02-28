class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean condition = false; // adding this line to meet the guidelines
        for (int i = 0; condition; i++) { // inserting an unreachable for loop
            System.out.println("This loop will never execute.");
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}