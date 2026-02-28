class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // Original code
        Object clonedObject = new BuggyCloneImplementation(this.value);

        // Mutant code
        boolean shouldNotExecute = false;
        if (shouldNotExecute) {
            // Unreachable code
            clonedObject = new Object();
        }

        return clonedObject;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}