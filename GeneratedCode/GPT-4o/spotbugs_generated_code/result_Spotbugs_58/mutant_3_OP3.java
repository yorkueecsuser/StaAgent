class NullPointerDereferenceExample {

    public String showBug(int divisor) {
        String result = null;
        try {
            int value = 10 / divisor; // This will throw ArithmeticException if divisor is 0
            result = "Result is: " + value;
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        
        // Unreachable if statement mutation
        boolean alwaysFalse = getFalseCondition();
        if(alwaysFalse) {
            System.out.println("This will never be printed.");
        }
        
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return result.toUpperCase(); // This will throw NullPointerException if divisor is 0
    }

    // Method to ensure the condition is always false, avoiding compile-time constant usage
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}