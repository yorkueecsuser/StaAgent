class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException

        // Mutation: Unreachable if branch with a condition that is always false at runtime
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    // Method to provide a condition that is always false
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