class NullPointerDereferenceExample {

    public String showBug(int x) { // Renamed 'divisor' to 'x'
        String result = null;
        try {
            int value = 10 / x; // This will throw ArithmeticException if x is 0
            result = "Result is: " + value;
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        return result.toUpperCase(); // This will throw NullPointerException if x is 0
    }

    public static void main(String[] args) {
        NullPointerDereferenceExample example = new NullPointerDereferenceExample();
        System.out.println(example.showBug(0)); // This will demonstrate the bug
    }
}