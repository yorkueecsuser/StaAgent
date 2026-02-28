class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        // Mutant code (unreachable for loop)
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable since the condition is always false
        }

        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }

    // This is a placeholder method for getting a condition which is always false
    private boolean getCondition() {
        return false;
    }
}