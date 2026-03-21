class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
if (false && false && false && false && true && false && true && true && true && false && false) {long cbrlzpfx = -609046834;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}