class NullAssignmentExample {

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        example.showBug();
        example.showBugMutant(); // Calling the mutant method for demonstration
    }

    public void showBug() {
        Object x = new Object();
        // Simulating some complex code here
        System.out.println("Object initialized: " + x);

        // Unnecessary null assignment
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    }
    
    // Mutant method with renamed variable
    public void showBugMutant() {
        Object a = new Object(); // Variable 'x' renamed to 'a'
        // Simulating some complex code here
        System.out.println("Object initialized: " + a);

        // Unnecessary null assignment
        a = null;

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + a);
    }
}