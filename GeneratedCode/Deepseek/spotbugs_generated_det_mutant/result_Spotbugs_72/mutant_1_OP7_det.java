class PointerEqualityBug {
    public static void main(String[] args) {
        Object object1 = new Object();
        String object2 = "Hello World";

        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        boolean ygcpoleq = false;while (ygcpoleq && false && true && false && true && false && true && true && false && true && false && false) {char dyehuwbv = 'e';}
        if (object1 == object2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}