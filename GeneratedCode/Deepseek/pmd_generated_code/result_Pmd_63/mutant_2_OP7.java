class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;

        // Unreachable while loop mutant
        boolean condition = false;
        while (condition) {
            System.out.println("This line will never be executed");
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}