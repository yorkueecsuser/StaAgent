class FinalizeOverloadExample {

    // This method is an incorrect attempt to overload the finalize method.
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is a custom finalize method with an integer parameter: " + a);

        // Unreachable if statement with a dynamic condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable due to a false condition.");
        }
    }

    // This method is an incorrect attempt to overload the finalize method.
    protected void finalize(String message) { // BUG: FinalizeOverloaded
        System.out.println("This is a custom finalize method with a string parameter: " + message);

        // Unreachable if statement with a dynamic condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable due to a false condition.");
        }
    }
    
    // Demonstrates the bug by calling the overloaded finalize methods directly
    public String showBug(int a, String message) {
        finalize(a);
        finalize(message);
        return "Overloaded finalize methods were called.";
    }

    // Method to provide a condition dynamically
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }
}