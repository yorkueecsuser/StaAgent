class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        boolean shouldRun = false; // Newly inserted statement for the unreachable if-else branch
        if (shouldRun) {
            // Unreachable code block
            System.out.println("This code will never be executed");
        } else {
            return super.clone();
        }
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    // New method added to return a constant value for the shouldRun variable
    private boolean getCondition() {
        return false;
    }
}