class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Unreachable for loop mutation
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            // This loop is unreachable
            System.out.println("This is unreachable");
        }

        return false;
    }
    
    // Method to dynamically determine loop condition at runtime
    private boolean getLoopCondition() {
        return false; // This will ensure the for loop is never executed
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}