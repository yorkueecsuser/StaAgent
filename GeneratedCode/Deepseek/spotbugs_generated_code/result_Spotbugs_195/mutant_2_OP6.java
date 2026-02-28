// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
// Mutated with Unreachable for loop
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean condition = false; // Unreachable condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop is unreachable because the condition is always false
            System.out.println("Unreachable loop in clone() method");
        }
        BuggyClone clone = (BuggyClone) super.clone();
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