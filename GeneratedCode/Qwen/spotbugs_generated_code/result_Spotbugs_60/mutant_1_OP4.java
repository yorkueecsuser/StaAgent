class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some operation that might throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            result = "unreachable";
        } else {
            result = "still unreachable";
        }
        
        return result.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}