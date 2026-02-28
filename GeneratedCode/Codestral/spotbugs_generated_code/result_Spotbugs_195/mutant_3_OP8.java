// Mutated Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE, with Renaming mutation
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        clone.setAnotherValue(20); // Mutated code: Calling a new overridable method setAnotherValue() with renamed variable
        return clone;
    }

    // Overridable method
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // New overridable method with a renamed variable
    public void setAnotherValue(int anotherValue) {
        this.value = anotherValue;
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}