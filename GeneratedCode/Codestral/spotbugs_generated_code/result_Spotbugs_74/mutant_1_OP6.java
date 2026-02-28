class ArrayEqualsBug {

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String[] array, String str) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This is an unreachable loop");
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