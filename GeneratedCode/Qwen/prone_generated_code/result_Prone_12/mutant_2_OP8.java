class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug

        // Mutant code with renaming
        int a = value;
        int b = shiftAmount;
        return a << b;
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1

        // Mutant code with renaming
        BadShiftAmountExample c = new BadShiftAmountExample();
        int d = c.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + d); // Expected output: 1
    }
}