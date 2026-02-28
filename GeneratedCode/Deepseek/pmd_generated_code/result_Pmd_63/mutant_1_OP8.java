class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        Object a = new Object();
        // big, complex piece of code here
        a = null;
        // big, complex piece of code here
        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}