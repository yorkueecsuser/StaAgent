class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
        // Mutant: Duplicating the return statement
        int result = value << shiftAmount; // Duplicate assignment
        System.out.println("Mutant result of shifting " + value + " by " + shiftAmount + ": " + result);
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}