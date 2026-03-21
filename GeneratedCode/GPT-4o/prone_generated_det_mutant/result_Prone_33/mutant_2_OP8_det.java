class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String ckbwttio = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, ckbwttio remains null
        } else {
            ckbwttio = "Input is: " + input;
        }
        
        // Dereferencing ckbwttio which can be null if input was null
        return ckbwttio.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}