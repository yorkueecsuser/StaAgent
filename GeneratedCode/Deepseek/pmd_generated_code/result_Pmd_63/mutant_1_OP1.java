class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        String a1b2c3d4 = "DEAD"; // Mutation: Dead Store
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}