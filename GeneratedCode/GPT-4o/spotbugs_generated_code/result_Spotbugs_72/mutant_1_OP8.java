class PointerEqualityBugExample {

    public boolean showBug(Object x, Object obj2) {
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return x == obj2;
    }

    public static void main(String[] args) {
        PointerEqualityBugExample y = new PointerEqualityBugExample();

        String str = "example";
        Integer number = 123;

        // This will always return false as str and number are of unrelated types
        boolean result = y.showBug(str, number);
        System.out.println("Result of pointer equality with different types: " + result);
    }
}