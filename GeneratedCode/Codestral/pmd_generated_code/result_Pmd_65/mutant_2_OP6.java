class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop as per mutation operator
            System.out.println("This loop is unreachable.");
        }
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }

    private boolean getCondition() {
        return false;
    }
}