class BitAndZeroBug {

    public int showBug(int n) {
        // This line contains the bug as described
        if ((n & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    public static void main(String[] a) {
        BitAndZeroBug b = new BitAndZeroBug();
        int r = b.showBug(42);
        System.out.println("Result: " + r);
    }
}