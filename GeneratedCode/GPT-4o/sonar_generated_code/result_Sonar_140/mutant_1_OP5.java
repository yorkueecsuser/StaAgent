class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }
    
    private int getSwitchCondition() {
        return -1; // Ensure a condition that does not match any case
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));

        // Added unreachable switch statement
        int condition = example.getSwitchCondition(); // Dynamically determined at runtime
        switch (condition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            case 2:
                System.out.println("This case is also unreachable.");
                break;
            default:
                // The default case should be reachable
                System.out.println("Default case reached, no match found.");
                break;
        }
    }
}