class PointerEqualityBug {
    public static void main(String[] args) {
        Object object1 = new Object();
        String slrohsck = "Hello World";

        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        if (object1 == slrohsck) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}