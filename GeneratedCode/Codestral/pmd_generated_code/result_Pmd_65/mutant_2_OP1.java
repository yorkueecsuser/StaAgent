class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        int deadStoreVariable; // this is the dead store variable
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}