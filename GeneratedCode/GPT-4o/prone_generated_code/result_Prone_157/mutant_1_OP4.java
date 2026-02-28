class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero

        // Unreachable if-else branch insertion
        boolean condition = getDynamicCondition(); // ensure the condition is dynamically determined
        if (condition) {
            System.out.println("This block is unreachable because condition is false.");
        } else {
            System.out.println("This is the else block for an unreachable if-statement.");
        }
        
        return result;
    }

    // Method to simulate dynamic condition evaluation
    private boolean getDynamicCondition() {
        return false; // The condition is always false, but not a compile-time constant
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}