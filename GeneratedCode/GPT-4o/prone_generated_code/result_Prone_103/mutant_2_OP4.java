class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        
        // Introduce an unreachable if-else statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the reachable branch.");
        }

        return result;
    }

    // Method to simulate a dynamic condition that returns false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}