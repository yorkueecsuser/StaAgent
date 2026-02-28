class ArrayComparisonBug {

    public boolean showBug(String[] stringArray, StringBuffer[] stringBufferArray) {
        // Unreachable if-else statement mutation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("This is also an unreachable block.");
        }

        return stringArray.equals(stringBufferArray); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)  
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime, but always returns false
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        String[] strArray = {"Hello", "World"};
        StringBuffer[] sbArray = {new StringBuffer("Hello"), new StringBuffer("World")};
        boolean result = bugDemo.showBug(strArray, sbArray);
        System.out.println("Result of comparison: " + result);
    }
}