class ArrayEqualsBug {

    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }

    public boolean showBug(String[] array, String str) {
        // Unreachable loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This line will never be executed.");
        }

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