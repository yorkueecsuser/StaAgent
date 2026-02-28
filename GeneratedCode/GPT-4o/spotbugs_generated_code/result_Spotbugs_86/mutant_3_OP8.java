class BitAndZeroBug {

    public int a(int b) {
        // This line contains the bug as described
        if ((b & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    public static void main(String[] c) {
        BitAndZeroBug d = new BitAndZeroBug();
        int e = d.a(42);
        System.out.println("Result: " + e);
    }
}