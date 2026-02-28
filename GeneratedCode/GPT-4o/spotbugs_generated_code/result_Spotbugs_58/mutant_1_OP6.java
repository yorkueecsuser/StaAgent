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

        // Inserting an unreachable for loop
        boolean conditionForLoop = getCondition(); // Non-final variable to control loop execution
        for (int i = 0; conditionForLoop; i++) {
            // Unreachable but syntactically correct code
            System.out.println("This is an unreachable loop");
        }
        
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return result.toUpperCase(); // This will throw NullPointerException if divisor is 0
    }
    
    // Method to ensure the unreachable for loop condition is never true
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}