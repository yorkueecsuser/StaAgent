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

        // Mutant code: Variable renaming
        Object a = new Object();
        // Simulating some complex code here
        System.out.println("Object initialized: " + a);

        // Unnecessary null assignment
        a = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + a);
    }
}