class NullPointerDereferenceExample {

    public String showBug(int divisor) {
        String wparqtvt = null;
        try {
            int aymqpqhg = 10 / divisor; // This will throw ArithmeticException if divisor is 0
            wparqtvt = "Result is: " + aymqpqhg;
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return wparqtvt.toUpperCase(); // This will throw NullPointerException if divisor is 0
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}