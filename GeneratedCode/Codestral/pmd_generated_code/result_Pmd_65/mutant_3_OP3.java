class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean unreachableCondition = getUnreachableCondition(); // Always returns false
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("Unreachable code executed!");
        }
        return new BuggyCloneImplementation(this.value); // This is bad, should be super.clone()
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}