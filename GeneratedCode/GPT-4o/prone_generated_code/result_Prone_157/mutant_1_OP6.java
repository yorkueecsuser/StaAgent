class SubstringExample {

    public String showBug(String input) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to the false condition
            System.out.println("This is an unreachable loop.");
        }

        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    // Method to dynamically determine the condition of the for loop at runtime
    private boolean getCondition() {
        return false; // This ensures the loop is unreachable but is evaluated at runtime
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}