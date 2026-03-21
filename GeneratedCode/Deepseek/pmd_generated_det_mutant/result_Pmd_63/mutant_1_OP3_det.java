class BugExample {

    public Object showBug() {
        if (true && false && true && true && true && false && true && false && false && false && false) {byte qfmdkknk = -124;}
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