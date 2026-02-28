class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate a condition that always throws an exception
            if (input.equals("test")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // Intentionally not setting result to any value, so it remains null
        }
        
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result = "unreachable";
        } else {
            result = "also unreachable";
        }
        
        return result.toLowerCase(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug("test");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}