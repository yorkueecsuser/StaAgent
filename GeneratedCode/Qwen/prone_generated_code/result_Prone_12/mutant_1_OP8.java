class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug

        // Mutant with renamed variable 'value' to 'a'
        int a = value;
        return a << shiftAmount;

        // Mutant with renamed variable'shiftAmount' to 'b'
        int b = shiftAmount;
        return value << b;
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1

        // Mutant with renamed variable 'example' to 'c'
        BadShiftAmountExample c = new BadShiftAmountExample();
        int resultC = c.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32 using mutant: " + resultC);

        // Mutant with renamed variable'result' to 'd'
        int d = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32 using mutant: " + d);
    }
}