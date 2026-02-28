class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int x, int constant) { // variable 'val' renamed to 'x'
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (x & constant) > 0; 
    }

    public String showBug(int v, int constant) { // variable 'val' renamed to 'v'
        boolean result = checkBitwiseOperation(v, constant);
        return "Result of bitwise check: " + result + " for val: " + v + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample e = new BitwiseSignBugExample(); // variable 'example' renamed to 'e'
        // Example call that demonstrates the bug
        System.out.println(e.showBug(5, -1));
    }
}