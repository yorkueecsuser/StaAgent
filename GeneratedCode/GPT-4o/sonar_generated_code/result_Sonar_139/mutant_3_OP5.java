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

        // Introducing an unreachable switch statement
        int switchValue = getSwitchValue(); // This method dynamically determines the value at runtime
        switch (switchValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // Intentionally left empty. The default case will never be reached.
                break;
        }
    }

    // A method to ensure the switch statement is unreachable
    public static int getSwitchValue() {
        return 0; // Ensures the switch case above never matches 1
    }
}