class BugExample {

    public Object showBug() {
        boolean ueblsezb = false;while (ueblsezb && false && false && true && false && false && false && false && true && false && true && false) {boolean xlnccpks = true;}
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