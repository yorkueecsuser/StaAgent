class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        boolean unreachableCondition = getUnreachableCondition(); // Added mutant
        while (unreachableCondition) { // Added mutant
            // This loop is unreachable, but it's added to meet the mutation operator requirement
        }
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    }

    private boolean getUnreachableCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}