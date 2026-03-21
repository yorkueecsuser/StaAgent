class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String euwbbchc = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, euwbbchc remains null
        } else {
            euwbbchc = "Input is: " + input;
        }
        
        // Dereferencing euwbbchc which can be null if input was null
        return euwbbchc.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}