// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
class BuggyClone implements Cloneable {
    private int fieldValue; // Mutation: Renamed 'value' to 'fieldValue'

    public BuggyClone(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clonedObject = (BuggyClone) super.clone();
        clonedObject.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        return clonedObject;
    }

    // Overridable method
    public void setValue(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getValue() {
        return fieldValue;
    }

    public void displayBug() throws CloneNotSupportedException { // Mutation: Renamed'showBug' to 'displayBug'
        BuggyClone clonedObject = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clonedObject.getValue());
    }
}