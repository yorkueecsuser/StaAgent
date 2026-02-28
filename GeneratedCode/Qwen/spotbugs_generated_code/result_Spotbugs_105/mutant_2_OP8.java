class ArrayComparisonBug {

    public boolean showBug(String[] stringArray, StringBuffer[] stringBufferArray) {
        return stringArray.equals(stringBufferArray); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)      
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        String[] strArray = {"Hello", "World"};
        StringBuffer[] sbArray = {new StringBuffer("Hello"), new StringBuffer("World")};
        boolean result = bugDemo.showBug(strArray, sbArray);
        System.out.println("Result of comparison: " + result);

        // Mutated code
        String[] a = {"Test", "Example"};
        StringBuffer[] b = {new StringBuffer("Test"), new StringBuffer("Example")};
        boolean c = bugDemo.showBug(a, b);
        System.out.println("Mutated result of comparison: " + c);
    }
}