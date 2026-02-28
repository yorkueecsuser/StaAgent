class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Inserting unreachable if-else branch
        boolean unreachableCondition = getDynamicCondition(); // Using a method to ensure runtime determination
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Alternative branch for completeness.");
        }
        
        return false;
    }
    
    // Method to ensure condition is evaluated at runtime
    private boolean getDynamicCondition() {
        return false; // Ensure the condition returns false at runtime
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}