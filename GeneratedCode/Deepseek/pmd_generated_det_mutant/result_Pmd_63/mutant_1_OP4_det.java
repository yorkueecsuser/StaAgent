class BugExample {

    public Object showBug() {
        if (true && false && false && false && false && false && true && false && true && false && false) {int uifzqxfc = 50286443;}else{char kjihnkyt = 'f';}
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