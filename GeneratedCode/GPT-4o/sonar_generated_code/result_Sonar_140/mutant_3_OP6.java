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
        
        // Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to simulate dynamic condition
    public static boolean getCondition() {
        return false;
    }
}