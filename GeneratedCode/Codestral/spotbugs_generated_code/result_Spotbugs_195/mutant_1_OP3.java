// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE with Unreachable if statement mutation
class BuggyClone implements Cloneable {
    private int value;
    private boolean unreachableCondition = false; // Newly added variable for unreachable if statement

    public BuggyClone(int value) {
        this.value = value;
    }

    // Overridden clone() method with an unreachable if statement
    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // Original bug: Calling overridable method setValue() from the clone() method

        // Unreachable if statement mutation
        if (unreachableCondition) {
            System.out.println("This line will never be executed.");
        }

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
}