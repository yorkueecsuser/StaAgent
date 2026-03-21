class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] tcloovnn = {"apple", "banana", "cherry"};
        String sncietkv = "apple";
        boolean elrtfibo = bug.showBug(tcloovnn, sncietkv);
        System.out.println("Result: " + elrtfibo);
    }
}