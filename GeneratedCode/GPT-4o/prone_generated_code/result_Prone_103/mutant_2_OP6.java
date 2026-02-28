class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // Insert an unreachable for loop
        boolean conditionFor = getCondition(); // Using a non-final method to ensure it's unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        return result;
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}