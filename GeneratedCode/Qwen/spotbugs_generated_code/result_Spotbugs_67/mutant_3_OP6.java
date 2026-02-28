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

            // Inserting unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor is always false
                System.out.println("This loop should never execute");
            }
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // This will demonstrate the bug
    }
}