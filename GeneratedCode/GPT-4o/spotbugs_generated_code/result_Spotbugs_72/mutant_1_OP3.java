class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Adding an unreachable if statement using a non-final variable
        boolean isFalse = getFalseCondition();
        if (isFalse) {
            System.out.println("This will never be printed");
        }

        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    private boolean getFalseCondition() {
        // Returns a value that is always false to make the if condition unreachable
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