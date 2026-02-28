class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero

        // Mutation: Adding an unreachable if statement
        boolean alwaysFalseCondition = getCondition(); // This method ensures the condition is non-constant
        if (alwaysFalseCondition) {
            System.out.println("This will never be printed.");
        }

        return result;
    }

    // Helper method to ensure a non-final boolean condition
    private boolean getCondition() {
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