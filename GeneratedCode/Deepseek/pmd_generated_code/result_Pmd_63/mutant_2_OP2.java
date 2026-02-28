class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        Object y = new Object(); // Mutation: Duplication
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