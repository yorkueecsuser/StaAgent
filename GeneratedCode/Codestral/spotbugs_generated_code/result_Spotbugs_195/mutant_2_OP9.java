// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
// Mutant code: Equivalent Method Call Replacement
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.anotherMethodThatSetsValue(10); // Mutant: Calling another overridable method to set value
        return clone;
    }

    // Overridable method
    public void setValue(int value) {
        this.value = value;
    }

    // New overridable method for mutant
    public void anotherMethodThatSetsValue(int value) {
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