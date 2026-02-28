class NullDereferenceExample {

    public String showBug(String input) {
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            // Unreachable while loop block
            System.out.println("This message will never be printed.");
        }
        
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is never entered
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}