class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException

        // Introducing an unreachable if-else statement using a dynamic condition
        boolean isUnreachable = isConditionFalse();
        if (isUnreachable) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable by design");
        }

        return result;
    }

    // Method to dynamically provide a false condition
    private boolean isConditionFalse() {
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