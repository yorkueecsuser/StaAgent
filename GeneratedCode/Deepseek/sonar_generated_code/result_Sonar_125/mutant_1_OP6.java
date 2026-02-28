class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
        // Unreachable for loop mutation
        for (int i = 0; conditionFor(); i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    public static int showBug(int shift) {
        int number = 1;
        return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    // Unreachable for loop mutation
    public static boolean conditionFor() {
        return false;
    }
}