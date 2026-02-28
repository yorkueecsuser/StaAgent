class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Comparing two unrelated types using pointer equality
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    }

    public static void main(String[] args) {
        PointerEqualityBugExample example = new PointerEqualityBugExample();

        String str = "example";
        Integer number = 123;

        // Duplicate the assignment statement as per the mutation operator
        // Original assignment
        boolean result = example.showBug(str, number);
        // Duplicated assignment
        result = example.showBug(str, number);

        System.out.println("Result of pointer equality with different types: " + result);
    }
}