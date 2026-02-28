class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        Object clonedObject = super.clone();

        // Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
                default:
                    // Default case should always be present in a switch statement
                    break;
            }
        }

        return clonedObject;
    }

    private boolean getCondition() {
        return false;
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}