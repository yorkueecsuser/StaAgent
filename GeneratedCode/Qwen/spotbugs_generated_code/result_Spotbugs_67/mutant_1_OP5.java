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

            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // Unreachable code
                    result = "Unreachable";
                    break;
                case 1:
                    // This case is always taken
                    System.out.println("This case is always taken");
                    break;
            }
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // This will demonstrate the bug
    }
}