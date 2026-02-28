class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public Object getCondition() {
        return false;    //This is the insertion of unreachable if-else statement
    }

    public void showMutant() {
        if(getCondition() == false) {
         //This is the unreachable code
        } else {
         //This is the reachable code
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.showMutant();
    }
}