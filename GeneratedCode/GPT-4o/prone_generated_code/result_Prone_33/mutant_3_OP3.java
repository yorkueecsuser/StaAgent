class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        // Inserted unreachable if branch
        boolean condition = getCondition(); // Method used to ensure it's not a compile-time constant
        if (condition) {
            result = "This branch is unreachable.";
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public boolean getCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}