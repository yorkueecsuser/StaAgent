class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method

        // Insert unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code executed");
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

    // Method to simulate unreachableValue for the switch statement
    private int getUnreachableValue() {
        return -1; // Always returns a value that will not match the case statement
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}