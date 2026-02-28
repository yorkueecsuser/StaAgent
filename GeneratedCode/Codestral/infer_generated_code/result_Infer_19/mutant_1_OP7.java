// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    // Method to return false
    private static boolean getCondition() {
        return false;
    }

    public static int showBug(int x, int y) {
        // Insert unreachable while loop
        while(getCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        return x + y;
    }
}