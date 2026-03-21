class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        boolean result = array.equals(str); // original bug
        result = array.equals(str); // duplicate bug
        return result; // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}