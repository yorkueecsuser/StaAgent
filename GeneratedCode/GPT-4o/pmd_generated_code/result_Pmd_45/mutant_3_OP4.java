class FinalizeOverloadExample {

    // This method is an incorrect attempt to overload the finalize method.
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is a custom finalize method with an integer parameter: " + a);
    }

    // This method is an incorrect attempt to overload the finalize method.
    protected void finalize(String message) { // BUG: FinalizeOverloaded
        System.out.println("This is a custom finalize method with a string parameter: " + message);
    }
    
    // Demonstrates the bug by calling the overloaded finalize methods directly
    public String showBug(int a, String message) {
        finalize(a);
        finalize(message);
        return "Overloaded finalize methods were called.";
    }

    // Adding a method to generate a runtime condition for the unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    // Method where the unreachable if-else statement is inserted
    public void demonstrateMutation() {
        boolean condition = getCondition();
        if (condition) {
            // This code block is unreachable due to condition always being false
            System.out.println("This block is unreachable due to the condition.");
        } else {
            // This block will always execute
            System.out.println("This block is always executed.");
        }
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
        
        // Demonstrating the insertion of the unreachable if-else statement
        example.demonstrateMutation();
    }
}