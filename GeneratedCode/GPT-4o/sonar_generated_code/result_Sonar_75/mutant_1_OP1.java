class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        int xabcdefg = 42; // Dead store with a randomly generated name of 8 characters
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        return result;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}