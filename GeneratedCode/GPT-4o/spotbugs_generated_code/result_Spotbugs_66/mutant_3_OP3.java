class NullDereferenceExample {

    public String showBug(String input) {
        boolean condition = getCondition(); // non-final variable to ensure runtime evaluation
        if (condition) {
            // This block is unreachable as condition is always false
            // but following the guideline to avoid compile-time constants directly
            System.out.println("This will never print");
        }
        
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }
    
    // Helper method to ensure condition is always false
    private boolean getCondition() {
        return false;
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