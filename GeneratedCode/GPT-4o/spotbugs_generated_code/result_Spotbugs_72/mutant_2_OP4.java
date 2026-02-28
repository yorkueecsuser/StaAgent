class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Introducing an unreachable if-else statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("Executing else block.");
        }
        
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    // Method to simulate a condition that returns false at runtime
    private boolean getFalseCondition() {
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