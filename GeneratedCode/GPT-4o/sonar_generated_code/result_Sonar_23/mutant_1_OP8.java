class CastExceptionExample {

    public Object showBug(Object input) {
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

// Mutant code with renamed variable
class CastExceptionExampleMutant {

    public Object showBug(Object q) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String r = (String) q; // BUG: Cast operations should not trigger a ClassCastException
        return r;
    }

    public static void main(String[] args) {
        CastExceptionExampleMutant example = new CastExceptionExampleMutant();
        
        try {
            // This will cause a ClassCastException since the input is not a String
            example.showBug(new Integer(10));
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}