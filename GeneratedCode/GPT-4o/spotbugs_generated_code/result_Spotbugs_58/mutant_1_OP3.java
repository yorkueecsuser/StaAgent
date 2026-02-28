class NullPointerDereferenceExample {

    public String showBug(int divisor) {
        String result = null;
        try {
            int value = 10 / divisor; // This will throw ArithmeticException if divisor is 0
            result = "Result is: " + value;
            
            // Unreachable if statement mutation
            boolean isUnreachable = getFalseCondition();
            if (isUnreachable) {
                System.out.println("This block is unreachable and will never execute.");
            }
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return result.toUpperCase(); // This will throw NullPointerException if divisor is 0
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}