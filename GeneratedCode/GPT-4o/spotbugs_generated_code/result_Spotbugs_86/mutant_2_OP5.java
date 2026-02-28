class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Unreachable switch statement
            int unreachableValue = getSwitchValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is case 1");
                    break;
                default:
                    System.out.println("Default case");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    private int getSwitchValue() {
        // This function returns a value that is not 1, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}