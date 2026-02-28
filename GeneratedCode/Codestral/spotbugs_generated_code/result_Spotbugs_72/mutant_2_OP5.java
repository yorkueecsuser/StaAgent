class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        int value = getValue(); // Assume this method always returns 0
        switch (value) {
            case 1:
                throw new IllegalStateException("This code should be unreachable"); // Unreachable switch statement
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }

    private int getValue() {
        return 0;
    }
}