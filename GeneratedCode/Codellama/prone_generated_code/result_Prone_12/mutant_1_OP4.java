class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Unreachable if-else statement mutant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // code
        } else {
            // alternative code
        }
    }

    // Helper method to return a boolean value
    public static boolean getCondition() {
        return false;
    }
}