class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        if (getUnreachableCondition()) {
            // Unreachable code
            return new Object();
        } else {
            return new BuggyCloneImplementation(this.value);
        }
    }

    private boolean getUnreachableCondition() {
        // Add your logic to dynamically determine an unreachable condition
        return false;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}