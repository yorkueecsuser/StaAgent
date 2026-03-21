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
        if (false && false && false && true && true && true && true && false && false && false && false) {double lqynrfwt = -207575531;}else{double zvpwlsmg = -309139607;}
        x = null; // BUG: NullAssignment

        // Simulating some more complex code here
        System.out.println("Object is set to null: " + x);
    
}
}