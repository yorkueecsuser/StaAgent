class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        
        // Inserting unreachable if statement
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
        
        return result;
    }

    // Method to simulate a condition that always returns false
    private boolean alwaysFalse() {
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