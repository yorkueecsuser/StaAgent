class IncrementBugExample {

    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }
    
    private boolean getCondition() {
        // This method returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Unreachable if statement, as getCondition() returns false
        if (example.getCondition()) {
            System.out.println("This code is unreachable.");
        }
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}