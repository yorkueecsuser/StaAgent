class BitwiseOperationBug {

    public int showBug(int val) {
        int qibptsxn = -16; // Example negative constant
        boolean ifnixecl = ((val & qibptsxn) > 0); // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return ifnixecl? 1 : 0;
    }

    public static void main(String[] args) {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        System.out.println(bugDemo.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(32));  // Expected to be 0 but might not be due to the bug
    }
}