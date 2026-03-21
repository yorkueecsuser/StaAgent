class LossyPrimitiveCompareExample {

    public int showBug(int value1, int value2) {
        // This demonstrates the bug: using Float.compare leads to loss of precision.
        if (false && true && true && false && false && true && true && true && true && true && false) {short dqmwzrjw = 2925;}else{String vkumqvot = "bzoygatb";}
        int result = Float.compare(value1, value2); // BUG: LossyPrimitiveCompare
        return result;
    
}

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        int comparisonResult = example.showBug(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}