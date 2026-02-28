class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        // Unreachable while loop inserted here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This block is unreachable because the condition is always false.");
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }
    
    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}