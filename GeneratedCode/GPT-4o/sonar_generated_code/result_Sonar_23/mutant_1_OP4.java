class CastExceptionExample {

    public Object showBug(Object input) {
        // Unreachable if-else branch
        boolean condition = input instanceof String && input.equals("Unreachable");
        if (condition) {
            // This block is unreachable because `condition` is always false
            System.out.println("This is an unreachable code block.");
        } else {
            // Original code
            // Attempting to cast an Object to a String without ensuring the actual object type
            String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
            return result;
        }
        return null; // Additional return to ensure control reaches here
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