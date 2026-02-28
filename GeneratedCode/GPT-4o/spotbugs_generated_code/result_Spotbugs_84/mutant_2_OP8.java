class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int x, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (x & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean y = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + y + " for val: " + val + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample z = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(z.showBug(5, -1));
    }
}