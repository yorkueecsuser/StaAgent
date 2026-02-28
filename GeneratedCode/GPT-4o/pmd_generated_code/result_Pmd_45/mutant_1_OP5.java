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
        
        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                break;
        }
        
        return "Overloaded finalize methods were called.";
    }

    private int getUnreachableSwitchValue() {
        return 0; // Always returns 0, making the switch unreachable
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }
}