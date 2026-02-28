// Java code demonstrating the bug and the added mutant:
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
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

    public void showBugAndMutant() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());

        // Added mutant: Calling overridable method setValue() in a loop context
        int i = 0;
        do {
            clone.setValue(i);
            i++;
        } while (i < 5);
        System.out.println("Mutant value: " + clone.getValue());
    }
}