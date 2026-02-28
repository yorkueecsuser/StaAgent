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
        
        // Unreachable switch statement
        int unreachableSwitchVar = getUnreachableValue(); // Method to ensure the switch is unreachable
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    public static int getUnreachableValue() {
        return 0; // Always returning 0, and no case for 0 in the switch, making it unreachable
    }
}