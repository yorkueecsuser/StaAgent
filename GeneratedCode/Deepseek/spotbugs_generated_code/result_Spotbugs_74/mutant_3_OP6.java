class ArrayEqualsBug {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String[] array, String str) {
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            // This loop will never be executed because the condition is always false
        }
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}