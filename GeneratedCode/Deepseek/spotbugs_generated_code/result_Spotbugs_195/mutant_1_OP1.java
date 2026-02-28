class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int deadStore; // Dead Store: Unused variable
        BuggyClone clone = (BuggyClone) super.clone();
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        deadStore = 5; // Assigning a value to the dead store variable
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