class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        
        // Introducing an unreachable while loop with a non-final variable condition
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        return result;
    }
    
    // Method to return the condition for the unreachable while loop
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