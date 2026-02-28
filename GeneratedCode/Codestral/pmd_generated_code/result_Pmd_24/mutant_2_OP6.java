class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean unreachableCondition = getUnreachableCondition(); // This method should always return false
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable as the condition always returns false
        }
        return super.clone();
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}