class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        boolean result = obj1 == obj2;

        // Introduce a variable that determines the switch condition
        int unreachableValue = getUnreachableValue(); // This method call ensures runtime determination

        // Unreachable switch statement
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            // No default case, making the switch statement effectively unreachable
        }

        return result;
    }

    // Method to ensure the switch statement is dynamically unreachable
    public int getUnreachableValue() {
        return 0; // Always returns 0, making the switch condition never match the case
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