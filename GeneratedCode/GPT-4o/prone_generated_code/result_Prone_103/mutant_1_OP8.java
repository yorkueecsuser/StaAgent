class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        return result;
    }

    public int showBugMutant(int x, int y) { // Renamed 'value1' to 'x' and 'value2' to 'y'
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(x, y); // BUG: LossyPrimitiveCompare
        return result;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);

        // Added mutant method invocation
        int comparisonResultMutant = example.showBugMutant(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result Mutant: " + comparisonResultMutant);
    }
}