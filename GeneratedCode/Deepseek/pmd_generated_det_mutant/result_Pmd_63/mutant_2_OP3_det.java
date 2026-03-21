class BugExample {

    public Object showBug() {
        if (false && false && false && true && false && true && false && false && false && false && false) {double qswpovdz = 141164376;}
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