class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean unreachableCondition = getUnreachableCondition(); // Added a method call to ensure dynamic condition
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop as the condition is always false
            System.out.println("This line should never execute");
        }
        return super.clone();
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures that the condition is always false
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}