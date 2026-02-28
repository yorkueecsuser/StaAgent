class BugExample {

    public Object showBug() {
        boolean condition = false;
        condition =!condition;
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        if (condition) {
            // This is a mutant - Unreachable Switch Statement
        }
        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}