class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        
        // Adding an unreachable for loop mutation
        boolean conditionFor = simulateComplexCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }
        
        return result;
    }

    // Simulate a complex condition for the unreachable for loop
    private boolean simulateComplexCondition() {
        return false; // This ensures the loop is never entered
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}