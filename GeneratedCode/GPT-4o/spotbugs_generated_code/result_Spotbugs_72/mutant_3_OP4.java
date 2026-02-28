class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        boolean alwaysFalse = getCondition(); // Non-final variable used to avoid compile-time constant
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else.");
        }

        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        PointerEqualityBugExample example = new PointerEqualityBugExample();

        String str = "example";
        Integer number = 123;

        // This will always return false as str and number are of unrelated types
        boolean result = example.showBug(str, number);
        System.out.println("Result of pointer equality with different types: " + result);
    }
}