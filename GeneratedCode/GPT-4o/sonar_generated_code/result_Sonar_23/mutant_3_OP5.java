class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException

        // Unreachable switch statement added as per the mutation operator
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 0:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        // Returns a constant value that is not checked for in the switch cases
        return -1;
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