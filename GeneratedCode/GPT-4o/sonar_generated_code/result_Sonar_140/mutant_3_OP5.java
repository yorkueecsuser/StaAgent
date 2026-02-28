class IncrementBugExample {

    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));

        // Adding unreachable switch statement
        int unreachableSwitchVariable = getUnreachableSwitchValue(); // Ensures non-constant evaluation
        switch (unreachableSwitchVariable) {
            case 1000: // Arbitrary unreachable case
                System.out.println("This is unreachable");
                break;
            default:
                // No operation; switch is intentionally unreachable
                break;
        }
    }

    // Method to provide a non-final variable for the switch statement
    private static int getUnreachableSwitchValue() {
        return -1; // Ensures the switch case never matches
    }
}