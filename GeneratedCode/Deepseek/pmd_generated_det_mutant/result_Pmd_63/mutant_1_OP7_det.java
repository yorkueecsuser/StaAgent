class BugExample {

    public Object showBug() {
        boolean rjolrcgq = false;while (rjolrcgq && true && true && true && true && true && true && false && false && true && true && false) {short tjlielxd = -2892;}
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