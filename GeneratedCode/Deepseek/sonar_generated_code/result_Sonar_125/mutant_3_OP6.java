class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        for (int i = 0; false; i++) {
            // Unreachable code
        }
        return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }
}