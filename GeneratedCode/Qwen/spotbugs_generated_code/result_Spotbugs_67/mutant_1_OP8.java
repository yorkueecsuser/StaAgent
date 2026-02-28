class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some processing that could throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Forcing an exception");
            }
            result = "Processed: " + input;
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH) 
            result.toString(); // This line will throw a NullPointerException if the exception is caught
        }
        return result;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // This will demonstrate the bug
    }

    // Mutated code
    public String mutatedShowBug(String a) {
        String b = null;
        try {
            // Simulate some processing that could throw an exception
            if (a.equals("throw")) {
                throw new IllegalArgumentException("Forcing an exception");
            }
            b = "Processed: " + a;
        } catch (IllegalArgumentException c) {
            System.out.println("Caught exception: " + c.getMessage());
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH) 
            b.toString(); // This line will throw a NullPointerException if the exception is caught
        }
        return b;
    }
}