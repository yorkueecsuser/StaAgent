class ArrayComparisonBug {

    public boolean showBug(String[] stringArray, StringBuffer[] stringBufferArray) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop is unreachable");
        }
        
        return stringArray.equals(stringBufferArray); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)  
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        String[] strArray = {"Hello", "World"};
        StringBuffer[] sbArray = {new StringBuffer("Hello"), new StringBuffer("World")};
        boolean result = bugDemo.showBug(strArray, sbArray);
        System.out.println("Result of comparison: " + result);
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}