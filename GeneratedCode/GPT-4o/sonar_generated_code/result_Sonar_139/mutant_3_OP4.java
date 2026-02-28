class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input);
        System.out.println("Result: " + result);

        // Inserting unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code will never run.");
        } else {
            System.out.println("This is the always executed else branch.");
        }
    }

    // Method to provide a dynamic but consistently false condition
    private static boolean getUnreachableCondition() {
        return Math.random() < 0; // This condition is always false as probability cannot be negative
    }
}