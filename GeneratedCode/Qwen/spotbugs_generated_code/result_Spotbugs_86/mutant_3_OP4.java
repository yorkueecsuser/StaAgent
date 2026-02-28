class BitwiseBugExample {

    // Method to demonstrate the bug
    public boolean showBug(int e) {
        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code due to shouldRun always being false.");
        }
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Result of showBug with 5: " + example.showBug(5));
        System.out.println("Result of showBug with 0: " + example.showBug(0));
        System.out.println("Result of showBug with -1: " + example.showBug(-1));
    }
}