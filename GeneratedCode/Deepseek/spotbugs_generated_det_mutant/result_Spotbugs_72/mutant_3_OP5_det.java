class PointerEqualityBug {
    public static void main(String[] args) {
        Object object1 = new Object();
        String object2 = "Hello World";

        // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        int ffexujfd = 0;switch  (ffexujfd) {case 1:boolean wxmgvpim = true;break;default:int dlbenbwb = 249517813;break;}
        if (object1 == object2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}