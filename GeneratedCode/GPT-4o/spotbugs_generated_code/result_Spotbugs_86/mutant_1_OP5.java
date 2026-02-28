class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Unreachable switch statement inserted here
            int unreachableCondition = 2; // Using a non-final variable
            switch (unreachableCondition) { // This switch condition will never be 1
                case 1:
                    System.out.println("Unreachable case");
                    break;
                default:
                    break;
            }
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