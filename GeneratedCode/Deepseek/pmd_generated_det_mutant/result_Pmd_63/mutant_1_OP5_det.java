class BugExample {

    public Object showBug() {
        int xkhqybbt = 0;switch  (xkhqybbt) {case 1:String fawrqmkr = "jrpvvavv";break;default:byte vwxpglgg = -27;break;}
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