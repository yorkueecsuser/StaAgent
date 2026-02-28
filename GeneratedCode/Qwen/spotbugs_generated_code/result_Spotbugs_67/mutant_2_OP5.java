class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some processing that could throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Forcing an exception");
            }
            result = "Processed: " + input;
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH) 
            result.toString(); // This line will throw a NullPointerException if the exception is caught

            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // This case is unreachable because getCondition() always returns false
                    result = "Unreachable Case";
                    break;
                default:
                    // Default case is also unreachable due to the same reason
                    result = "Default Unreachable Case";
                    break;
            }
        }
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // This will demonstrate the bug
    }
}