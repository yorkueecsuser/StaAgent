class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare

        // Introduce an unreachable while loop
        boolean conditionWhile = getCondition(); // Using a method to determine condition
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return result;
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}