class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        boolean isUnreachable = false;
        if(isUnreachable) {
            // This block is unreachable
            throw new IllegalStateException("This should not be reached");
        }
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}