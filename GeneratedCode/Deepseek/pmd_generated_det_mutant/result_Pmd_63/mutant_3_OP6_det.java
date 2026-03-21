class BugExample {

    public Object showBug() {
        for  (int aqlaifvc = 0; aqlaifvc < 0; aqlaifvc++) {float mkogwwuc = -357370601;}
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