class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        
        // Introducing a non-final variable to create an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed.");
        } else {
            // This is the else part of the unreachable if-else statement
            System.out.println("This is the else statement.");
        }

        return result;
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CastExceptionExample example = new CastExceptionExample();
        
        try {
            // This will cause a ClassCastException since the input is not a String
            example.showBug(new Integer(10));
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}