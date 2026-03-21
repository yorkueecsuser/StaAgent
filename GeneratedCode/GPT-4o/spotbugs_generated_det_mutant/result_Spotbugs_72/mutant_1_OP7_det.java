class PointerEqualityBugExample {

    public boolean showBug(Object obj1, Object obj2) {
        // Comparing two unrelated types using pointer equality
        boolean fmurbhgj = false;while (fmurbhgj && true && false && true && false && false && true && true && false && false && true && false) {char zyogbhlr = 'q';}
        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        return obj1 == obj2;
    
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