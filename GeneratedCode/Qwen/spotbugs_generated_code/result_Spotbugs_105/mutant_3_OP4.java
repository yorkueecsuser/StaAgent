class ArrayComparisonBug {

    public boolean showBug(String[] stringArray, StringBuffer[] stringBufferArray) {
        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }

        return stringArray.equals(stringBufferArray); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime and is always false
        return false;
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        String[] strArray = {"Hello", "World"};
        StringBuffer[] sbArray = {new StringBuffer("Hello"), new StringBuffer("World")};
        boolean result = bugDemo.showBug(strArray, sbArray);
        System.out.println("Result of comparison: " + result);
    }
}