class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = null; // This ensures that result is definitely null
        }
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
        
        return result.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
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