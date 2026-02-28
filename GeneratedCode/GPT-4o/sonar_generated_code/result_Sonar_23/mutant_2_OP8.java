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

// Mutant
class CastExceptionExample_Mutant1 {

    public Object showBug(Object x) { // Variable input renamed to x
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) x; // BUG: Cast operations should not trigger a ClassCastException
        return result;
    }

    public static void main(String[] args) {
        CastExceptionExample_Mutant1 example = new CastExceptionExample_Mutant1();
        
        try {
            // This will cause a ClassCastException since the input is not a String
            example.showBug(new Integer(10));
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}