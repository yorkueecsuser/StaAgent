class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This block will never be executed because getCondition() always returns false
        }
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        return clone;
    }

    // Overridable method
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }

    private boolean getCondition() {
        return false; // This method is used to avoid using "false" directly in the while loop condition
    }
}