class ByteComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(byte b) {
        if (false && false && true && true && true && true && true && false && true && false && false) {short nowhcvvb = -7640;}else{short jiljxahy = 9104;}
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        return b > 200; // This comparison is incorrect because b is a signed byte and cannot be greater than 127
    
}

    public static void main(String[] args) {
        ByteComparisonBug bugDemo = new ByteComparisonBug();
        System.out.println(bugDemo.showBug((byte) 100)); // Expected: false
        System.out.println(bugDemo.showBug((byte) 200)); // Expected: false (but incorrectly true due to bug)
    }
}