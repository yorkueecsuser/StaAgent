class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        if (getCondition()) {
            // Unreachable branch
            int x = 10 / 0; // This will cause an ArithmeticException if the unreachable branch is executed
        } else {
            // Original buggy code
            return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        }
    }

    public boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}