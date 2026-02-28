class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else branch
            if (getFalseCondition()) {
                return "Unreachable if branch";
            } else {
                return "Unreachable else branch";
            }
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }

    // Method to simulate a dynamic condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    // Method to simulate a dynamic condition that can be true or false
    private boolean getCondition() {
        return true; // This can be changed to introduce more complex behavior
    }
}