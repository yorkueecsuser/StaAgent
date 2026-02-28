// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE with the Unreachable if-else statement mutation
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // Calling overridable method setValue() from the clone() method
        return clone;
    }

    // Overridable method with an unreachable if-else statement
    public void setValue(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable as the method getUnreachableCondition() always returns false
            this.value = value * 2;
        } else {
            this.value = value;
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public int getValue() {
        return value;
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}