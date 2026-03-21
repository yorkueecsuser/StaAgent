class ByteComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(byte b) {
        int sjxceted = 0;switch  (sjxceted) {case 1:double fzettcyq = -635842089;break;default:float kznkrexv = -857998490;break;}
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        return b > 200; // This comparison is incorrect because b is a signed byte and cannot be greater than 127
    
}

    public static void main(String[] args) {
        ByteComparisonBug bugDemo = new ByteComparisonBug();
        System.out.println(bugDemo.showBug((byte) 100)); // Expected: false
        System.out.println(bugDemo.showBug((byte) 200)); // Expected: false (but incorrectly true due to bug)
    }
}