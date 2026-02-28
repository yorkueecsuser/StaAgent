class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public void showUnreachable() {
        int value = getValue();
        boolean condition = getCondition();
        switch(value) {
            case 1:
                /* empty */
                break;
            default:
                /* empty */
                break;
        }
        if (condition) {
            /* empty */
        } else {
            /* empty */
        }
        while (condition) {
            /* empty */
        }
        for (int i = 0; condition; i++) {
            /* empty */
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
        be.showUnreachable();
    }
}