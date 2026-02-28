class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}