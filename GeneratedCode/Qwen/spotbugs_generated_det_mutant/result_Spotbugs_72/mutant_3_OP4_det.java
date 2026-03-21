class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
if (true && false && false && false && true && false && true && false && false && false && false) {int iztpkcqp = -555727585;}else{boolean jqszwmhb = false;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}