class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }

    // Mutant Code
    public String showBugMutant(Integer a) {
        String b = null;
        
        // Assuming a represents some complex logic where it might be null
        if (a == null) {
            // Do nothing, b remains null
        } else {
            b = "Input is: " + a;
        }
        
        // Dereferencing b which can be null if a was null
        return b.toUpperCase(); // BUG: DereferenceWithNullBranch
    }
}