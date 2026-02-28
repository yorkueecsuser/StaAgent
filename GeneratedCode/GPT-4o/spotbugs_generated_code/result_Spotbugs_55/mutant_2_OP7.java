class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // Unreachable while loop mutation
        boolean unreachableCondition = getUnreachableCondition(); // This method ensures the condition is non-final
        while (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }
    
    // Helper method to ensure the unreachable condition is non-final
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}