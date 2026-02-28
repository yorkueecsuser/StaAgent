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
        // Introduce an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("This else branch is always executed.");
        }
        
        finalize(a);
        finalize(message);
        return "Overloaded finalize methods were called.";
    }

    // Method to ensure the condition is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }
}