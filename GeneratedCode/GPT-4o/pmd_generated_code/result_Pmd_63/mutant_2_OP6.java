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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // This method ensures the condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    // A method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }
}