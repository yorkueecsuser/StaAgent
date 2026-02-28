class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // Original code
        return new BuggyCloneImplementation(this.value);
    }

    public boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        // Adding unreachable while loop
        while (getCondition()) {
            System.out.println("This line will never be printed.");
        }
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}