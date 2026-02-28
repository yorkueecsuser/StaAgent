class NullPointerExample {

    public String showBug(String input) {
        String result = null;

        // Unreachable while loop mutation
        boolean falseCondition = getFalseCondition();
        while (falseCondition) {
            System.out.println("This is an unreachable loop");
        }
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}