class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public Object showMutant() {
        Object y = null; // MUTANT: Renaming
        y = new Object();
        // big, complex piece of code here
        y = null;
        // big, complex piece of code here
        return y;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.showMutant();
    }
}