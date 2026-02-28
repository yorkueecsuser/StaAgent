class IncrementBugExample {

    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Method to ensure runtime evaluation of the condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();

        // Inserting an unreachable for loop
        boolean conditionFor = example.getCondition();
        for (int k = 0; conditionFor; k++) {
            // This code block will never be executed
            System.out.println("Unreachable loop");
        }
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}