class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop mutation
            System.out.println("This loop will never execute");
        }
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }

    private boolean getCondition() { // Method added to avoid compile-time constants
        return false;
    }
}