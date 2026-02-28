class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Use dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
    }

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
    }
    
    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        // The condition is set to always return false
        // but it cannot be a compile-time constant
        return false;
    }
}