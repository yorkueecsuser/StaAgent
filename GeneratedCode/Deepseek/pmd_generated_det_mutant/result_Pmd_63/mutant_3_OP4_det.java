class BugExample {

    public Object showBug() {
        if (true && false && false && true && false && true && false && true && false && true && false) {String fjozjlof = "bligdxsy";}else{short xzqpycnz = -8088;}
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