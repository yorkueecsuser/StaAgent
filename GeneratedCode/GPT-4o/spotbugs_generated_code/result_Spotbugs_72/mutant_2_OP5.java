class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    public static void main(String[] args) {
        PointerEqualityBugExample example = new PointerEqualityBugExample();

        String str = "example";
        Integer number = 123;

        // This will always return false as str and number are of unrelated types
        boolean result = example.showBug(str, number);
        System.out.println("Result of pointer equality with different types: " + result);

        // Mutant: Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed because value is always 0");
                break;
            default:
                System.out.println("Default case in unreachable switch statement.");
        }
    }

    private static int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable for case 1
    }
}