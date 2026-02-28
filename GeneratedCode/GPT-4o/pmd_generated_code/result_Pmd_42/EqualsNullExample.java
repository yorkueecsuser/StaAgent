class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Non-final variable
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        return false;
    }
    
    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        return false; // Always returns false to ensure the loop is unreachable
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}