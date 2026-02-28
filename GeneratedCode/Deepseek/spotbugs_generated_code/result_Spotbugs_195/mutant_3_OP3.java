class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Unreachable if statement mutation
        if (getValue() == Integer.MIN_VALUE) {
            // This code will never execute
            System.out.println("This is an unreachable statement.");
        }

        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // Original bug: Calling overridable method setValue() from the clone() method
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