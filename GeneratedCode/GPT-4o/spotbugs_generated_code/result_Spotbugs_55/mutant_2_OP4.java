class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // Unreachable if-else branch inserted
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            result = "This block is unreachable";
        } else {
            result = "This else block is also unreachable";
        }

        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }
    
    // Method to ensure the condition is always false at runtime
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}