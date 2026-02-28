class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Original code
        int result = Integer.parseInt(input); // BUG: AlwaysThrows
        
        // Introduce unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue(); // Ensures the switch is always unreachable
        switch (unreachableSwitchValue) {
            case 9999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // No action needed
                break;
        }

        return result;
    }

    // Helper method to ensure non-final value for the switch
    private int getUnreachableValue() {
        return 0; // Returns a value that does not match any case above
    }
}