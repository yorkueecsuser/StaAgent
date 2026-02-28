class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Inserting unreachable for loop with a dynamically determined condition
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }
        
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    private boolean getUnreachableCondition() {
        // This condition is always false, making the loop unreachable
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