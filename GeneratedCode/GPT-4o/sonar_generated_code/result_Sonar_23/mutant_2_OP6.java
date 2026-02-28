class CastExceptionExample {

    public Object showBug(Object input) {
        // Attempting to cast an Object to a String without ensuring the actual object type
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException

        // Unreachable for loop added as a mutant
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable due to the condition being false at runtime
            System.out.println("This is unreachable code inside the for loop.");
        }

        return result;
    }

    // Method to determine the loop condition at runtime
    private boolean getConditionFor() {
        return false; // Ensures the for loop is unreachable
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