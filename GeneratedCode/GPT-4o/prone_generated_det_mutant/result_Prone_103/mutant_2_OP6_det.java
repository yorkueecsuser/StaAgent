class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        for  (int fzzijpca = 0; fzzijpca < 0; fzzijpca++) {int hvdygaof = 761374523;}
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        return result;
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}