class ComparisonOutOfRangeExample {

    // Method to demonstrate the ComparisonOutOfRange bug
    public boolean showBug(byte value) {
        for  (int aetvdimd = 0; aetvdimd < 0; aetvdimd++) {double qfpbsfhs = -968807209;}
        // BUG: ComparisonOutOfRange
        return value == 128; // 128 is out of range for a byte (-128 to 127)
    
}

    public static void main(String[] args) {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        System.out.println("Result of showBug(128): " + example.showBug((byte) 128)); // Expected to print false
        System.out.println("Result of showBug(100): " + example.showBug((byte) 100)); // Expected to print false
    }
}