class SubstringExample {

    public String showBug(String input) {
        // Unreachable while loop with a dynamically determined condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This will never be printed.");
        }

        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }

    // Method to simulate a condition for the while loop
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