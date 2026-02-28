class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        // Mutation: Adding unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
        }
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    // Dummy method to prevent compile errors. You should replace this with your actual condition
    private boolean getCondition() {
        return false;
    }
}