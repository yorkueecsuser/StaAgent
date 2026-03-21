class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        for  (int tdtnmwrs = 0; tdtnmwrs < 0; tdtnmwrs++) {int vistlaet = 682270542;}
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}