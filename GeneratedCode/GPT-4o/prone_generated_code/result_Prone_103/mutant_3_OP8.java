class LossyPrimitiveCompareExample {
    
    // Mutant: Variable renaming mutation applied on value1
    public int showBug(int a, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        int result = Float.compare(a, value2); // BUG: LossyPrimitiveCompare
        return result;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}