class EqualsNullExample {

    public boolean showBug(String input) {
        // Unreachable if branch added with a non-final variable to avoid compile-time constant conditions
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable due to the condition being false
            System.out.println("This should never print.");
        }
        
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    // Method to return a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}