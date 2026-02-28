class NullAssignmentExample {

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        example.showBug();
    }

    public void showBug() {
        Object x = new Object();
        // Simulating some complex code here
        System.out.println("Object initialized: " + x);

        // Unnecessary null assignment
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);

        // Unreachable if-else statement mutation
        boolean alwaysFalse = isConditionTrue();
        if (alwaysFalse) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement");
        }
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean isConditionTrue() {
        return false;
    }
}