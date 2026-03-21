class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
int gohqjllq = 0;switch  (gohqjllq) {case 1:short eeqjluzz = -622;break;default:int cldfueqj = -685463754;break;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}