class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}