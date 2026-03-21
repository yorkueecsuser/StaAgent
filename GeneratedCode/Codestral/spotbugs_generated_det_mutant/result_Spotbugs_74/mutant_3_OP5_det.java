class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
int aotfkhoa = 0;switch  (aotfkhoa) {case 1:boolean vcogoujb = true;break;default:double cdbinvqz = -30387516;break;}

        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}