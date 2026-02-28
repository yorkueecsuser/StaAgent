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
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) { // Unreachable while loop due to false condition
            // This block is intentionally left empty
            // The conditionWhile is false, so this loop will never execute
        }
        finalize(a);
        finalize(message);
        return "Overloaded finalize methods were called.";
    }

    private boolean getCondition() {
        return false; // This method provides the false condition to the while loop
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }
}