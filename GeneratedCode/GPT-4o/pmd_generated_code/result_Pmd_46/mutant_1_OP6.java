class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    }

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }
    
    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
        
        // Inserting an unreachable for loop
        boolean conditionFor = isConditionMet(); // Using a method to provide a condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code.");
        }
    }

    // Helper method to simulate a runtime condition
    private static boolean isConditionMet() {
        return false; // This makes the for loop condition always false
    }
}