class BitwiseBugExample {

    // Method to demonstrate the bug
    public boolean showBug(int e) {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }

        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if-else branches unreachable
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Result of showBug with 5: " + example.showBug(5));
        System.out.println("Result of showBug with 0: " + example.showBug(0));
        System.out.println("Result of showBug with -1: " + example.showBug(-1));
    }
}