class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        String s = str; // Renamed variable'str' to's'
        return array.equals(s); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple"; // Original variable
        String s = str; // Renamed variable
        boolean result = bug.showBug(array, s);
        System.out.println("Result: " + result);
    }
}