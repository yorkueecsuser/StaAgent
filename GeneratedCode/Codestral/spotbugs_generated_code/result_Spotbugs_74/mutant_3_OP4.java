class ArrayEqualsBug {

    private boolean getCondition() {
        return false; // This method always return false to make the `if` block unreachable
    }

    public boolean showBug(String[] array, String str) {
        if (getCondition()) {
            // Unreachable block
            int a = 10;
            a = a / 0; // This line will cause a division by zero error, but it's unreachable
        } else {
            // Original bug remains intact
            return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        }
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}