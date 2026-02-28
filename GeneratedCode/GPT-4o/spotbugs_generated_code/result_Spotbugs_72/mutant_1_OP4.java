class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        if (isUnreachable()) {
            // Unreachable if-else statement
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This else branch is also unreachable");
        }
        return obj1 == obj2;
    }

    private boolean isUnreachable() {
        // Simulate an unreachable condition
        return false && System.currentTimeMillis() < 0;
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