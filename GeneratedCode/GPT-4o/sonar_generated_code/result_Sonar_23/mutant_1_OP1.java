class CastExceptionExample {

    public Object showBug(Object input) {
        // Inserting a dead store as per the mutation operator
        int abcdefgh = 42; // Unused variable declaration

        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        return result;
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