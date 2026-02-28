class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero

        // Adding unreachable if-else branch
        boolean condition = getFalseCondition(); // This method will always return false
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block is also unreachable.");
        }

        return result;
    }
    
    // Method to provide a false condition
    private boolean getFalseCondition() {
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