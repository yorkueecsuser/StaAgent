class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // Adding unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition(); // dynamically determined at runtime
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is always executed.");
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }
    
    // Method to provide dynamic condition for the unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false; 
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}