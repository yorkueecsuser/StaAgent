class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String fibdnbex = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, fibdnbex remains null
        } else {
            fibdnbex = "Input is: " + input;
        }
        
        // Dereferencing fibdnbex which can be null if input was null
        return fibdnbex.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}