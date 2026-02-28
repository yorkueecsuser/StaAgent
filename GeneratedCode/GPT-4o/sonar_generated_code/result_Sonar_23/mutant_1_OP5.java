class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        
        // Insert an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case is never expected to be true
                System.out.println("This is an unreachable case");
                break;
        }
        
        return result;
    }

    // A method to simulate a dynamic condition that leads to unreachable code
    private int getUnreachableValue() {
        // This method always returns a value other than 9999
        return 0;
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