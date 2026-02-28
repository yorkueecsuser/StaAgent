class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        
        // Inserting unreachable if-else branch
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This else branch is always executed.");
        }
        
        return result;
    }
    
    // Method to provide a condition that can be determined at runtime
    private boolean getCondition() {
        // This is a dummy condition that always returns false
        // but it is dynamically determined at runtime
        return false;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}