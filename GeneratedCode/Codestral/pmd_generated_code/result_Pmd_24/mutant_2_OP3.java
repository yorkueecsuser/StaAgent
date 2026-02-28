class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        // Unreachable if statement
        if (isConditionFalse()) {
            // This code will never execute
            System.out.println("Unreachable code executed");
        }

        return super.clone();
    }

    // Method to determine the condition at runtime
    private boolean isConditionFalse() {
        return false;
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}