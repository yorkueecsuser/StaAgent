class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        // Introducing an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This will never be printed");
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    // Helper method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}