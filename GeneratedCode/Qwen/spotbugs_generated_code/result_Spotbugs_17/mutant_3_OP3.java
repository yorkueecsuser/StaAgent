class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            input = "UNREACHABLE";
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}