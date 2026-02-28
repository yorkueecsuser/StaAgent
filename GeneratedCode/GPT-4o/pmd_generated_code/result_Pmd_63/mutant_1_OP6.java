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

        // Inserting unreachable for loop as per mutation operator
        boolean unreachableLoopCondition = getUnreachableCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("This is unreachable code.");
        }
    }

    // Method to simulate a condition for the unreachable for loop
    private boolean getUnreachableCondition() {
        return false;
    }
}