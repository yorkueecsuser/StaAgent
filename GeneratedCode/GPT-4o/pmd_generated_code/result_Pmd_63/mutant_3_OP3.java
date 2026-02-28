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

        // Introducing unreachable if statement mutant
        boolean isUnreachable = computeCondition(); // use a method to determine condition
        if (isUnreachable) {
            System.out.println("This branch is unreachable.");
        }

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    }

    // Method to simulate a condition that always returns false
    private boolean computeCondition() {
        return false;
    }
}