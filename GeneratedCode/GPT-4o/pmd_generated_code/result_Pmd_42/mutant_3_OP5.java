class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Introduce an unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                // This block is unreachable because unreachableCondition always returns a value other than 1.
                System.out.println("This is unreachable.");
                break;
            default:
                // Default case to handle other values; this will execute if unreachableCondition is not 1.
                break;
        }
        
        return false;
    }
    
    // Method to ensure the switch statement is unreachable due to its return value
    private int getUnreachableCondition() {
        // This method returns a value that makes the case condition in the switch statement unreachable
        return 0; // Always returns 0, so the "case 1" block in the switch statement is unreachable
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}