class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        return result;
    }

    public int showBugMutant(int x, int y) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int mutationResult = Float.compare(x, y); // BUG: LossyPrimitiveCompare
        return mutationResult;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
        
        int comparisonResultMutant = example.showBugMutant(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Mutant Comparison Result: " + comparisonResultMutant);
    }
}