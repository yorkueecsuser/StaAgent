class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        
        // Inserting unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }
        
        return result;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;  // This ensures the branch is unreachable but not a compile-time constant.
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}