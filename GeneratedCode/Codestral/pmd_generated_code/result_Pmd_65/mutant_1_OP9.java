class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        // Equivalent Loop Replacement mutation: replacing the return statement with a do-while loop
        do {
            return new BuggyCloneImplementation(this.value); // This is still bad, it should be super.clone()
        } while (false);
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}