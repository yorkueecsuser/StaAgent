class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        
        // Unreachable if statement mutation
        boolean condition = someCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        }

        return result;
    }

    // Method to simulate a condition that's always false
    private boolean someCondition() {
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