// Mutated Java code demonstrating the bug and the unreachable switch statement
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
            default:
                // This is the reachable part of the switch statement
                clone.setValue(10); // Original bug: Calling overridable method setValue() from the clone() method
                break;
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

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // This will never be 1
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}