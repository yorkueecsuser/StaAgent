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
        if (true && true && false && false && false && true && true && false && false && true && false) {int bydeyjvh = 364613289;}
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    
}
}