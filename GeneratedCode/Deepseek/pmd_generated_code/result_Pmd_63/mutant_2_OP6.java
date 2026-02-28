class BugExample {

    private boolean getConditionFor() {
        return true;
    }

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here

        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // insert unreachable loop here
            if (i > 1000000000) {
                break;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}