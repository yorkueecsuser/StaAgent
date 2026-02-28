class BuggyClass implements Cloneable {

    private int buggyField;
    private boolean unreachableCondition = false;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        while (unreachableCondition) {
            // This unreachable while loop is inserted for the mutation operator
        }
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}