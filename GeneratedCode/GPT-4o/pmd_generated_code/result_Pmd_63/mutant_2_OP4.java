class NullAssignmentExample {

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        example.showBug();
    }

    public void showBug() {
        Object x = new Object();
        // Simulating some complex code here
        System.out.println("Object initialized: " + x);

        // Unreachable if-else statement mutant
        boolean neverTrueCondition = getFalseCondition();
        if (neverTrueCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        // Unnecessary null assignment
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    }

    // Method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }
}