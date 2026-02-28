class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public void showUnreachableWhileLoop() {
        while (false) {
            // This code will never be executed as the while loop condition is always false.
            // This is to avoid unreachable statement error.
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.showUnreachableWhileLoop();
    }
}