class BugExample {

    public Object showBug() {
        for  (int gidyrapf = 0; gidyrapf < 0; gidyrapf++) {char uwzspkff = 'p';}
        Object x = null; // BUG: NullAssignment
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