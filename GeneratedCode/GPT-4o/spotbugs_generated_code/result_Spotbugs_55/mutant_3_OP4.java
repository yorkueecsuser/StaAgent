class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // Mutation: Unreachable if-else statement
        boolean alwaysFalse = getAlwaysFalseCondition();
        if (alwaysFalse) {
            result = "This path is never taken";
        } else {
            result = result; // Maintain the original logic
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    private boolean getAlwaysFalseCondition() {
        // Method to simulate a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}