class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare

        // Unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        return result;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false; // The condition is false, making the loop unreachable
    }
}