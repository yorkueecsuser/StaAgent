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
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            case 2:
                System.out.println("This case is also unreachable.");
                break;
            default:
                // Default case is also unreachable
                System.out.println("Default case, unreachable.");
                break;
        }

        return "Overloaded finalize methods were called.";
    }

    public static void main(String[] args) {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        System.out.println(example.showBug(10, "Hello"));
    }

    // Method to ensure the switch statement is always unreachable
    private int getUnreachableValue() {
        return 0; // This value does not match any case in the switch
    }
}