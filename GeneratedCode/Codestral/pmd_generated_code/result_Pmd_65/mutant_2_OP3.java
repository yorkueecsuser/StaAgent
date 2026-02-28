class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean isFalse = falseCondition(); // Method returning a false condition
        if (isFalse) {
            System.out.println("This line is unreachable"); // Unreachable code
        }
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }

    private boolean falseCondition() {
        return false; // Always false method
    }
}