class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public Object renamedShowBug() { // Renamed Method
        Object a = null; // Renamed Variable
        a = new Object();
        // big, complex piece of code here
        a = null;
        // big, complex piece of code here
        return a;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.renamedShowBug(); // Added method call to mutated method
    }
}