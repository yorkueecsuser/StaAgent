class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
int sdvdvwda = 0;switch  (sdvdvwda) {case 1:double sokosqqj = -473014990;break;default:double jekukitx = -436181602;break;}

        return str == num; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    
}

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}