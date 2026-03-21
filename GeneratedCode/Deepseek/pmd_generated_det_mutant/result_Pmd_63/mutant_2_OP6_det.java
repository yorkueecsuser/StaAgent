class BugExample {

    public Object showBug() {
        for  (int jbktvrlm = 0; jbktvrlm < 0; jbktvrlm++) {float cxzgfhhz = -504129809;}
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