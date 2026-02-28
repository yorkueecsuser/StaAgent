class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        if (false) {
            System.out.println("This branch is unreachable.");
        }
        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}