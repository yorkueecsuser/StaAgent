class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
boolean cjkpjrte = false;while (cjkpjrte && false && true && false && false && false && false && true && true && true && true && false) {double rxzztcpn = -473647485;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}