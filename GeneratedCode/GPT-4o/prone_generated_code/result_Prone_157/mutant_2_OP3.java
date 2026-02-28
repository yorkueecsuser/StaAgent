class SubstringExample {

    public String showBug(String input) {
        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    // Method to ensure the condition is always false
    private boolean getUnreachableCondition() {
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