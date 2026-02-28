class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute due to the false condition
            System.out.println("This is an unreachable code block.");
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }
    
    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}