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

        // Dead Store: Unused variable declaration
        int abcdxyzq = 42; // Randomly generated variable name

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    }
}