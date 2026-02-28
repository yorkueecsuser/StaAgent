class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)

        // Adding an unreachable switch statement as per the mutation operator description
        int unreachableVariable = getUnreachableValue(); // Method call to ensure dynamic evaluation
        switch (unreachableVariable) {
            case 9999: // Arbitrary case that will never be hit
                System.out.println("This line is unreachable and should never be printed.");
                break;
        }

        return result;
    }

    // Helper method to ensure runtime evaluation for the switch statement
    private int getUnreachableValue() {
        return -1; // Always returns a value that doesn't match any switch case
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}