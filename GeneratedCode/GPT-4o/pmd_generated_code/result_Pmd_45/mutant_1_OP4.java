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

        // Inserting an unreachable if-else statement with a dynamic condition
        boolean isUnreachable = determineUnreachability();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        return "Overloaded finalize methods were called.";
    }

    private boolean determineUnreachability() {
        // This method always returns false, making the if branch logically unreachable
        return false;
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }
}