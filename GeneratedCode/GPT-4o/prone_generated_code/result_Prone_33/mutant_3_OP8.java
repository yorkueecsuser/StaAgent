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
}

// Mutant Code
class DereferenceWithNullBranchExample_mutant {

    public String showBug(Integer x) { // Renamed 'input' to 'x'
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (x == null) { // Use the renamed variable
            // Do nothing, result remains null
        } else {
            result = "Input is: " + x; // Use the renamed variable
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample_mutant example = new DereferenceWithNullBranchExample_mutant();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}