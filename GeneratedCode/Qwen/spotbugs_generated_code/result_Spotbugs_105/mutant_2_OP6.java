class ArrayComparisonBug {

    public boolean showBug(String[] stringArray, StringBuffer[] stringBufferArray) {
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }

        return stringArray.equals(stringBufferArray); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    private boolean getCondition() {
        // This method always returns false, making the for loop unreachable
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