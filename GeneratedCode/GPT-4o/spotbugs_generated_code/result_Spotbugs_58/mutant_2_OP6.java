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
        
        // Unreachable for loop inserted as per mutation operator
        boolean conditionFor = false; // Using a non-final variable to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This for loop is unreachable and will never execute.");
        }

        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return result.toUpperCase(); // This will throw NullPointerException if divisor is 0
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}