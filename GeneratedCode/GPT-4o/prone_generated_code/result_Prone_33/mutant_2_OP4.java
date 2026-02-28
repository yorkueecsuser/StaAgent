class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        // Inserting unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println("The condition was false");
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }
    
    // Method to provide a runtime condition, which is always false in this case
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}