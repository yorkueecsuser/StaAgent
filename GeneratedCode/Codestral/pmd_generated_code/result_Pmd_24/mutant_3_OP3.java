// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block will never get executed due to the condition being always false
            throw new RuntimeException("Unreachable code executed");
        }
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}