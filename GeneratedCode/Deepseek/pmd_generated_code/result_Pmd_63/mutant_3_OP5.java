class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public void unreachableSwitchStatement() {
        int value = 0;
        switch(value) {
            case 1:
                // code
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.unreachableSwitchStatement();
    }
}