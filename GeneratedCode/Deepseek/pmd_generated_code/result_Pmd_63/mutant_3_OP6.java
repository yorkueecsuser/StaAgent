class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here

        // Mutation code
        for (int i = 0; false; i++) {
            // Unreachable code
        }

        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}