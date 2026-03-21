class ByteComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(byte b) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        return b > 200; // This comparison is incorrect because b is a signed byte and cannot be greater than 127
    }
public static void main(String [] args){
    ByteComparisonBug bugDemo = new ByteComparisonBug();
    bugDemo = new ByteComparisonBug();
    System.out.println(bugDemo.showBug(( byte)100));
    System.out.println(bugDemo.showBug(( byte)200));
}
}