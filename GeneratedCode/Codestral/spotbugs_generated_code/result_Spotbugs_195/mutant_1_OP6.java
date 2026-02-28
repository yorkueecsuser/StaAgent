// Java code demonstrating the bug with an additional unreachable for loop mutant: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
class BuggyClone implements Cloneable {
    private int value;
    private boolean unreachableCondition = false;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop mutant
            System.out.println("This line will never be executed");
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
}