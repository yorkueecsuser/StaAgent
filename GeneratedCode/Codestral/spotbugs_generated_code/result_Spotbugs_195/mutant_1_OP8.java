// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
class BuggyClone implements Cloneable {
    private int val;

    public BuggyClone(int val) {
        this.val = val;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        return clone;
    }

    // Overridable method
    public void setValue(int val) {
        this.val = val;
    }

    public int getValue() {
        return val;
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}