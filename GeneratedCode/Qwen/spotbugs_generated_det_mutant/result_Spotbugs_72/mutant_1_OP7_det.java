class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
boolean kicajnug = false;while (kicajnug && false && true && true && true && false && false && false && false && false && true && false) {double rwxjoqxk = -5040146;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}