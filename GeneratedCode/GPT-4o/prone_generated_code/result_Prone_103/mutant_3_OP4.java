class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare

        // Unreachable if-else statement mutation
        boolean runUnreachableCode = getFalseCondition();
        if (runUnreachableCode) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This branch is also unreachable.");
        }

        return result;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}