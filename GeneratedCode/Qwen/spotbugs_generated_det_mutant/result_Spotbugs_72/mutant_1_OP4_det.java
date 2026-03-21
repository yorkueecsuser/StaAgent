class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
if (true && false && false && false && true && true && true && true && true && false && false) {byte ptkoieel = 52;}else{long xmnohvqo = -220438158;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}