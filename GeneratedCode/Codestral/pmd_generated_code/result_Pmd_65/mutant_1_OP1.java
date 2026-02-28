class BuggyCloneImplementation implements Cloneable {
    int value;
    int deadStore; // <-- Dead store added here

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    }

    public void showBug() {
        deadStore = 10; // <-- Dead store is initialized but not used
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}