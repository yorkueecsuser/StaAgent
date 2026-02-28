class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = null; // This ensures that result is definitely null
        }
        
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            result = "Unreachable";
        }
        
        return result.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
    }

    private boolean getCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}