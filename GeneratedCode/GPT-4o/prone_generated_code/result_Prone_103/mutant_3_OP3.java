class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        
        // Introduce an unreachable if statement using a non-final variable.
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable");
        }

        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}