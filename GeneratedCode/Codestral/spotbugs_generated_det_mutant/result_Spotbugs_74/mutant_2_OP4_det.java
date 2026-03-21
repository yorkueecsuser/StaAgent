class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
if (true && false && false && true && false && false && true && false && false && false && false) {int nlmfeuol = 132887168;}else{float rrnigqrl = -96816672;}

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